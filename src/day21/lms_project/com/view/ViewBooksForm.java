package com.view;

import com.controller.BookController;
import com.model.Book;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class ViewBooksForm extends JFrame {
    private JFrame parent;

    public ViewBooksForm(JFrame parent){
        this.parent = parent;

        setTitle("All Books");
        setSize(650, 450);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Header
        JLabel header = new JLabel("All Books", SwingConstants.CENTER);
        header.setFont(new Font("Segoe UI", Font.BOLD, 22));
        header.setBorder(new EmptyBorder(15, 10, 15, 10));
        add(header, BorderLayout.NORTH);

        // Table
        String[] columns = {"Title", "Author", "ISBN", "Quantity"};
        DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
        JTable table = new JTable(tableModel);
        table.setRowHeight(28);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        table.getTableHeader().setBackground(new Color(200, 220, 240));
        table.getTableHeader().setForeground(Color.BLACK);

        // Center align
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

        List<Book> books = BookController.getAllBooks();
        for(Book book: books) {
            Object[] row = {
                    book.getTitle(),
                    book.getAuthor(),
                    book.getIsbn(),
                    book.getQuantity()
            };
            tableModel.addRow(row);
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new EmptyBorder(10, 20, 10, 20));
        add(scrollPane, BorderLayout.CENTER);

        // Back Button
        JPanel buttonPanel = new JPanel();
        JButton backBtn = new JButton("Back");
        // Border, font, background

        buttonPanel.add(backBtn);
        add(buttonPanel, BorderLayout.SOUTH);

        // BACK BUTTON LOGIC HERE
        backBtn.addActionListener(e -> {
            dispose();
            parent.setVisible(true);
        });

        setVisible(true);
    }
}
