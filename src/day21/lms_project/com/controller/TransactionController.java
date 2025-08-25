package com.controller;

import com.db.DatabaseConnection;
import com.model.Transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TransactionController {
    public static boolean issueBook(Transaction t) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String check = "SELECT quantity FROM book WHERE isbn = ?";
            PreparedStatement checkStmt = con.prepareStatement(check);
            checkStmt.setString(1, t.getIsbn());
            ResultSet rs = checkStmt.executeQuery();

            if(rs.next()) {
                int qty = rs.getInt("quantity");
                if (qty <= 0) {
                    return false; // no books available
                }

                String insert = "INSERT INTO transaction (member_id, isbn, issue_date) " +
                        "VALUES (?, ?, ?)";
                PreparedStatement insertStmt = con.prepareStatement(insert);
                insertStmt.setString(1, t.getMemberId());
                insertStmt.setString(2, t.getIsbn());
                insertStmt.setDate(3, new java.sql.Date(t.getIssueDate().getTime()));
                insertStmt.executeUpdate();

                String updateQty = "UPDATE book SET quantity = quantity-1 WHERE isbn = ?";
                PreparedStatement updateStmt = con.prepareStatement(updateQty);
                updateStmt.setString(1, t.getIsbn());
                updateStmt.executeUpdate();

                return true;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public static boolean returnBook(String memberId, String isbn) {
        try(Connection con = DatabaseConnection.getConnection()) {
            String find = "SELECT id FROM transaction WHERE member_id = ? AND isbn = ? AND return_date IS NULL LIMIT 1";
            PreparedStatement pst = con.prepareStatement(find);
            pst.setString(1, memberId);
            pst.setString(2, isbn);
            ResultSet rs = pst.executeQuery();

            if(rs.next()) {
                int transactionId = rs.getInt("id");

                // Update return_date
                String update = "UPDATE transaction SET return_date = ? WHERE id = ?";
                PreparedStatement updateStmt = con.prepareStatement(update);
                updateStmt.setDate(1, new java.sql.Date(System.currentTimeMillis()));
                updateStmt.setInt(2, transactionId);
                updateStmt.executeUpdate();

                // Increase book quantity
                String updateBook = "UPDATE book SET quantity = quantity + 1 WHERE isbn = ?";
                PreparedStatement updateBookStmt = con.prepareStatement(updateBook);
                updateBookStmt.setString(1, isbn);
                updateBookStmt.executeUpdate();

                return true;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
