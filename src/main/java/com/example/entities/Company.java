package com.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table
public class Company {
    @Id
    @Column(length = 20)
    private long com_id;
    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;
    @Column(length = 2000)
    private String about;
    @Column(length = 255)
    private String comp_name;
    @Column(length = 255)
    private String email;
    @Column(length = 255)
    private String phone;
    @Column(length = 255)
    private String web_url;
    @OneToMany
    private List<Job> jobs;

    public Company() {
    }

    public Company(long com_id, Address address, String about, String comp_name, String email, String phone, String web_url) {
        this.com_id = com_id;
        this.address = address;
        this.about = about;
        this.comp_name = comp_name;
        this.email = email;
        this.phone = phone;
        this.web_url = web_url;
    }

    public long getCom_id() {
        return com_id;
    }

    public void setCom_id(long com_id) {
        this.com_id = com_id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    @Override
    public String toString() {
        return "Company{" +
                "com_id=" + com_id +
                ", address=" + address +
                ", about='" + about + '\'' +
                ", comp_name='" + comp_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", web_url='" + web_url + '\'' +
                '}';
    }
}
