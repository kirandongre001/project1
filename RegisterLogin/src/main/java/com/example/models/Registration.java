package com.example.models;

import jakarta.persistence.*;
import java.sql.Date;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(length=100)
    String fname;

    @Column(length=100)
    String lname;

    @Column(length=100)
    String email_id;

    @Column
    Date dob;

    @Column
    String address;

    @Column
    String password;

    @OneToOne
    @JoinColumn(name="user_id")
    Login user_id;

    public Registration(int id, String fname, String lname, String email_id, Date dob, String address, String password, Login user_id) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.email_id = email_id;
        this.dob = dob;
        this.address = address;
        this.password = password;
        this.user_id = user_id;
    }

    public Registration(String fname, String lname, String email_id, Date dob, String address, String password, Login user_id) {
        this.fname = fname;
        this.lname = lname;
        this.email_id = email_id;
        this.dob = dob;
        this.address = address;
        this.password = password;
        this.user_id = user_id;
    }

    public Registration() {
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail_id() {
        return email_id;
    }

    public Date getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public Login getUser_id() {
        return user_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_id(Login user_id) {
        this.user_id = user_id;
    }


    @Override
    public String toString() {
        return "Registration{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", email_id='" + email_id + '\'' +
                ", dob=" + dob +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
