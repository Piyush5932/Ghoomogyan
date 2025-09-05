package com.example.ghoomogyaan.model;

import com.google.firebase.Timestamp;

public class Usermodel {
    private String phone;
    private String username;
    private com.google.firebase.Timestamp created;

    public Usermodel() {
    }

    public Usermodel(String phone, String username, Timestamp created) {
        this.phone = phone;
        this.username = username;
        this.created = created;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }
}
