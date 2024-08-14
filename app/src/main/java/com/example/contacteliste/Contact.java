package com.example.contacteliste;

import java.io.Serializable;

public class Contact implements Serializable {

    private String name;
    private String phoneNumber;
    private String email;
    private String website;

    public Contact(String name, String phoneNumber, String email, String website) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.website = website;
    }
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public String getWebsite() {
        return website;
    }
}
