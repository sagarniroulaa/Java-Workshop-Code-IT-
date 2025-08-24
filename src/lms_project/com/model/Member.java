package com.model;

public class Member {
    private int id;
    private String name, memberId, contact;

    public Member(String name, String memberId, String contact) {
        this.name = name;
        this.memberId = memberId;
        this.contact = contact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", memberId='" + memberId + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
