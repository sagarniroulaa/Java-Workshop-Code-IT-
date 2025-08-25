package com.view;

import com.controller.MemberController;
import com.model.Member;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class ViewMembersForm extends JFrame {
    private JFrame parent;

    public ViewMembersForm(JFrame parent) {
        this.parent = parent;

        setTitle("All Members");
        setSize(650, 450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Header
        JLabel header = new JLabel("All Members", SwingConstants.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 22));
        header.setBorder(new EmptyBorder(15, 10, 15, 10));
        add(header, BorderLayout.NORTH);

        // Table
        String[] columns = {"Name", "Member ID", "Contact"};
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);

        JTable table = new JTable(tableModel);
        table.setRowHeight(28);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        // Bold header
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        table.getTableHeader().setBackground(new Color(200, 220, 240));
        table.getTableHeader().setForeground(Color.BLACK);

        // Center
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        // Load data
        List<Member> members = MemberController.getAllMembers();
        for (Member m: members) {
            Object[] row = {
                m.getName(),
                m.getMemberId(),
                m.getContact()
            };

            tableModel.addRow(row);
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new EmptyBorder(10, 20, 10, 20));
        add(scrollPane, BorderLayout.CENTER);

        // Back button
        JPanel buttonPanel = new JPanel();
        JButton backBtn = new JButton("Back");
        backBtn.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        backBtn.setBackground(new Color(230, 240, 250));
        backBtn.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 200, 230), 1),
                new EmptyBorder(8, 20, 8, 20)
        ));

        backBtn.addActionListener(e -> {
            dispose();
            parent.setVisible(true);
        });

        buttonPanel.add(backBtn);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
