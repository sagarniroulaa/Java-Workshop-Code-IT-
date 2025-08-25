package com.view;

import com.controller.BookController;
import com.model.Book;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class AddBookForm extends JFrame {
    private JFrame parent;

    public AddBookForm(JFrame parent) {
        this.parent = parent;

        setTitle("Add New Book");
        setSize(400, 350);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Header
        JLabel header = new JLabel("Add New Book", SwingConstants.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 20));
        header.setBorder(new EmptyBorder(20, 10, 20, 10));
        add(header, BorderLayout.NORTH);

        // Form Panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBorder(new EmptyBorder(10, 40, 10, 40));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField isbnField = new JTextField();
        JTextField quantityField = new JTextField();

        addFormRow(formPanel, gbc, 0, "Title: ", titleField);
        addFormRow(formPanel, gbc, 1, "Author: ", authorField);
        addFormRow(formPanel, gbc, 2, "ISBN: ", isbnField);
        addFormRow(formPanel, gbc, 3, "Quantity: ", quantityField);

        add(formPanel, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        JButton saveButton = new JButton("Save");
        JButton cancelButton = new JButton("Cancel");

        Font btnFont = new Font("Segoe UI", Font.PLAIN, 15);
        JButton[] buttons = {saveButton, cancelButton};
        for(JButton btn: buttons) {
            btn.setFont(btnFont);
            btn.setBackground(new Color(230, 240, 250));
            btn.setBorder(BorderFactory.createCompoundBorder(
               BorderFactory.createLineBorder(new Color(180, 200, 230), 1),
                       new EmptyBorder(8, 20, 8, 20)
            ));
        }

        buttonPanel.add(saveButton);
        buttonPanel.add(cancelButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // LOGIC HERE
        saveButton.addActionListener(e -> {
            String title = titleField.getText().trim();
            String author = authorField.getText().trim();
            String isbn = isbnField.getText().trim();
            int quantity = Integer.parseInt(quantityField.getText().trim());

            if(title.isEmpty() || author.isEmpty() || isbn.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "All fields are required!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            Book book = new Book(title, author, isbn, quantity);
            BookController.addBook(book);
            JOptionPane.showMessageDialog(this, "Book added successfully!");
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
