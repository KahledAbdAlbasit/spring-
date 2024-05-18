package com.kahledabdalbaset.workersrealproject.models;

import jakarta.persistence.*;

@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @Column(name = "admin_ssn")
    private int adminSsn; // Assuming SSN is a string and is the primary key

    @Column(name = "e_mail")
    private String email; // Field name is adjusted to be more common Java naming convention

    @Column(name = "password")
    private String password;

    @Column(name = "sex")
    private String sex; // Consider using an enumeration for this field

    @Column(name = "name")
    private String username;

    // Constructors
    public Admin() {
    }

    public Admin(int adminSsn, String email, String password, String sex, String username) {
        this.adminSsn = adminSsn;
        this.email = email;
        this.password = password;
        this.sex = sex;
        this.username = username;
    }

    // Getters and Setters
    public int getAdminSsn() {
        return adminSsn;
    }

    public void setAdminSsn(int adminSsn) {
        this.adminSsn = adminSsn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    // Optional: Add toString, equals, and hashCode methods if needed

    @Override
    public String toString() {
        return "User{" +
                "adminSsn='" + adminSsn + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + username + '\'' +
                '}';
    }
}
