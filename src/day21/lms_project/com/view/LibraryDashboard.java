package com.view;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LibraryDashboard extends JFrame {

    public LibraryDashboard() {
        setTitle("Library Mgmt System");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Header
        JLabel titleLabel = new JLabel("Library Management System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 22));
        titleLabel.setBorder(new EmptyBorder(20, 10, 20, 10));
        add(titleLabel, BorderLayout.NORTH);

        // Buttons
        JPanel buttonPanel = new JPanel(new GridLayout(3, 2, 15, 15));
        buttonPanel.setBorder(new EmptyBorder(20, 40, 20, 40));

        JButton addBookBtn = new JButton("Add Book");
        JButton viewBooksBtn = new JButton("View Books");
        JButton addMemberBtn = new JButton("Register Member");
        JButton viewMembersBtn = new JButton("View Members");
        JButton issueBookBtn = new JButton("Issue Book");
        JButton returnBookBtn = new JButton("Return Book");

        Font btnFont = new Font("Segoe UI", Font.PLAIN, 16);
        JButton[] buttons = {addBookBtn, viewBooksBtn, addMemberBtn, viewMembersBtn,
        issueBookBtn, returnBookBtn};

        for(JButton btn: buttons) {
            btn.setFont(btnFont);
            btn.setBackground(new Color(230, 240, 250));
            btn.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(new Color(180, 200, 230, 1)),
                    new EmptyBorder(10, 15, 10, 15)
            ));
            buttonPanel.add(btn);
        }

        add(buttonPanel, BorderLayout.CENTER);

        // Event handling
        addBookBtn.addActionListener(e -> {
            setVisible(false);
            new AddBookForm(this);
        });

        viewBooksBtn.addActionListener(e -> {
            setVisible(false);
            new ViewBooksForm(this);
        });

        addMemberBtn.addActionListener(e -> {
            setVisible(false);
            new RegisterMemberForm(this);
        });

        viewMembersBtn.addActionListener(e -> {
            setVisible(false);
            new ViewMembersForm(this);
        });

        setVisible(true);
    }
}
