package com.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table()
public class Candidate {
    @Id
    @Column(length = 20)
    private long can_id;
    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;
    @Column(columnDefinition = "date")
    private LocalDate dob;
    @Column(length = 15)
    private String phone;
    @Column(length = 255)
    private String email;
    @Column(length = 255)
    private String full_name;
    @OneToMany()
    private List<Experience> experiences;
    @OneToMany()
    private List<Candidate_Skill> candidateSkills;

    public Candidate() {
    }

    public Candidate(long can_id, LocalDate dob, String phone, String email, String full_name) {
        this.can_id = can_id;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.full_name = full_name;
    }

    public long getCan_id() {
        return can_id;
    }

    public void setCan_id(long can_id) {
        this.can_id = can_id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "can_id=" + can_id +
                ", address=" + address +
                ", dob=" + dob +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", full_name='" + full_name + '\'' +
                '}';
    }
}
