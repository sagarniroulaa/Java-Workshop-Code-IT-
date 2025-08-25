package com.view;

import com.controller.MemberController;
import com.model.Member;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class RegisterMemberForm extends JFrame {
    private JFrame parent;

    public RegisterMemberForm(JFrame parent) {
        this.parent = parent;

        setTitle("Register Member");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Header
        JLabel header = new JLabel("Register Member", SwingConstants.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 20));
        header.setBorder(new EmptyBorder(20, 10, 20, 10));
        add(header, BorderLayout.NORTH);

        // Form Panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(new EmptyBorder(10, 40, 10, 40));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JTextField nameField = new JTextField();
        JTextField memberIdField = new JTextField();
        JTextField contactField = new JTextField();

        addFormRow(formPanel, gbc, 0, "Name: ", nameField);
        addFormRow(formPanel, gbc, 1, "Member ID: ", memberIdField);
        addFormRow(formPanel, gbc, 2, "Contact: ", contactField);

        add(formPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JButton registerButton = new JButton("Register");
        JButton cancelButton = new JButton("Cancel");

        Font btnFont = new Font("Segoe UI", Font.PLAIN, 15);
        JButton[] buttons = {registerButton, cancelButton};
        for(JButton btn: buttons) {
            btn.setFont(btnFont);
            btn.setBackground(new Color(230, 240, 250));
            btn.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(180, 200, 230), 1),
                    new EmptyBorder(8, 20, 8, 20)
            ));
            buttonPanel.add(btn);
        }

        add(buttonPanel, BorderLayout.SOUTH);

        // LOGIC HERE
        registerButton.addActionListener(e -> {
            String name = nameField.getText().trim();
            String memberId = memberIdField.getText().trim();
            String contact = contactField.getText().trim();

            if(name.isEmpty() || memberId.isEmpty() || contact.isEmpty()) {
                JOptionPane.showMessageDialog(
                        this,
                        "All fields are required!",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            Member member = new Member(name, memberId, contact);
            MemberController.addMember(member);
            JOptionPane.showMessageDialog(
                    this,
                    "Member registered successfully!"
            );
            dispose();
            parent.setVisible(true);
        });

        cancelButton.addActionListener(e -> {
            dispose();
            parent.setVisible(true);
        });

        setVisible(true);
    }

    private void addFormRow(JPanel panel, GridBagConstraints gbc, int y, String labelText,
                            JTextField textField) {
        gbc.gridx = 0;
        gbc.gridy = y;
        gbc.weightx = 0.3;
        panel.add(new JLabel(labelText), gbc);

        gbc.gridx = 1;
        gbc.weightx = 0.7;
        panel.add(textField, gbc);
    }
}
