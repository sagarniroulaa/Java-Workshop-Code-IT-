package day18.mini_project_3;

/*
    Enter a note title (JTextField) and content (JTextArea).
    Save the note to a file.
    Load a note from a file.
 */

import javax.swing.*;
import java.awt.*;
import java.io.*;

public class PersonalNotesApp extends JFrame {
    private JTextField titleField;
    private JTextArea contentArea;

    public PersonalNotesApp() {
        setTitle("Personal Notes App");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel topPanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel("Title: ");
        titleField = new JTextField();
        topPanel.add(titleLabel, BorderLayout.WEST);
        topPanel.add(titleField, BorderLayout.CENTER);

        contentArea = new JTextArea();
        contentArea.setLineWrap(true);
        contentArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(contentArea);

        JPanel bottomPanel = new JPanel();
        JButton saveBtn = new JButton("Save");
        JButton loadBtn = new JButton("Load");
        JButton clearBtn = new JButton("Clear");
        bottomPanel.add(saveBtn);
        bottomPanel.add(loadBtn);
        bottomPanel.add(clearBtn);

        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(bottomPanel, BorderLayout.SOUTH);

        saveBtn.addActionListener(e -> saveNote());
        loadBtn.addActionListener(e -> loadNote());
        clearBtn.addActionListener(e -> {
            titleField.setText("");
            contentArea.setText("");
        });
        setVisible(true);
    }

    private void saveNote() {
        String title = titleField.getText().trim();
        if (title.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a title!");
            return;
        }

        try (FileWriter writer = new FileWriter(title + ".txt")) {
            writer.write(contentArea.getText());
            JOptionPane.showMessageDialog(this, "Note saved as " + title + ".txt");
        } catch(IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving: " + e.getMessage());
        }
    }

    private void loadNote() {
        String title = titleField.getText().trim();
        if (title.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter file name(title) to load!");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(title + ".txt"))) {
            contentArea.setText("");
            String line;
            while((line = reader.readLine()) != null) {
                contentArea.append(line + "\n");
            }
            JOptionPane.showMessageDialog(this, "Note loaded from " + title + ".txt");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new PersonalNotesApp();
    }
}
