package com.controller;

import com.db.DatabaseConnection;
import com.model.Book;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookController {
    public static void addBook(Book book) {
        try(Connection con = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO book (title, author, isbn, quantity) VALUES" +
                    "(?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, book.getTitle());
            pst.setString(2, book.getAuthor());
            pst.setString(3, book.getIsbn());
            pst.setInt(4, book.getQuantity());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        try(Connection con = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM book";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while(rs.next()) {
                String title = rs.getString("title");
                String author = rs.getString("author");
                String isbn = rs.getString("isbn");
                int quantity = rs.getInt("quantity");

                Book book = new Book(title, author, isbn, quantity);
                books.add(book);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }
}
