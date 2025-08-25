package com.controller;

import com.db.DatabaseConnection;
import com.model.Book;
import com.model.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MemberController {
    public static void addMember(Member member) {
        try(Connection con = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO member (name, member_id, contact) VALUES" +
                    "(?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, member.getName());
            pst.setString(2, member.getMemberId());
            pst.setString(3, member.getContact());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Member> getAllMembers() {
        List<Member> members = new ArrayList<>();
        try(Connection con = DatabaseConnection.getConnection()) {
            String sql = "SELECT * FROM member";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            while(rs.next()) {
                String name = rs.getString("name");
                String memberId = rs.getString("member_id");
                String contact = rs.getString("contact");

                Member member = new Member(name, memberId, contact);
                members.add(member);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return members;
    }
}
