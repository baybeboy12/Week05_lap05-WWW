package com.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table
public class Experience {
    @Id
    @Column(length = 20)
    private long exp_id;
    @Column(columnDefinition = "date")
    private LocalDate from_date;
    @Column(columnDefinition = "date")
    private LocalDate to_date;
    @ManyToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    @Column(length = 100)
    private String role;
    @Column(length = 120)
    private String companyName;
    @Column(length = 400)
    private String work_desc;

    public Experience() {
    }

    public Experience(long exp_id, LocalDate from_date, LocalDate to_date, Candidate candidate, String role, String companyName, String work_desc) {
        this.exp_id = exp_id;
        this.from_date = from_date;
        this.to_date = to_date;
        this.candidate = candidate;
        this.role = role;
        this.companyName = companyName;
        this.work_desc = work_desc;
    }

    public long getExp_id() {
        return exp_id;
    }

    public void setExp_id(long exp_id) {
        this.exp_id = exp_id;
    }

    public LocalDate getFrom_date() {
        return from_date;
    }

    public void setFrom_date(LocalDate from_date) {
        this.from_date = from_date;
    }

    public LocalDate getTo_date() {
        return to_date;
    }

    public void setTo_date(LocalDate to_date) {
        this.to_date = to_date;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWork_desc() {
        return work_desc;
    }

    public void setWork_desc(String work_desc) {
        this.work_desc = work_desc;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "exp_id=" + exp_id +
                ", from_date=" + from_date +
                ", to_date=" + to_date +
                ", candidates=" + candidate +
                ", role='" + role + '\'' +
                ", companyName='" + companyName + '\'' +
                ", work_desc='" + work_desc + '\'' +
                '}';
    }
}
