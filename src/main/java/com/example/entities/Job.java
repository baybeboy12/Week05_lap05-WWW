package com.example.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Job {
    @Id
    @Column(length = 20)
    private  long job_id;
    @ManyToOne
    @JoinColumn(name = "com_id")
    private Company company;
    @Column(length = 2000)
    private String job_desc;
    @Column(length = 255)
    private String job_name;
    @OneToMany()
    private List<Job_Skill> jobSkills;

    public Job() {
    }

    public Job(long job_id, String job_desc, String job_name) {
        this.job_id = job_id;
        this.job_desc = job_desc;
        this.job_name = job_name;
    }

    public long getJob_id() {
        return job_id;
    }

    public void setJob_id(long job_id) {
        this.job_id = job_id;
    }

    public String getJob_desc() {
        return job_desc;
    }

    public void setJob_desc(String job_desc) {
        this.job_desc = job_desc;
    }

    public String getJob_name() {
        return job_name;
    }

    public void setJob_name(String job_name) {
        this.job_name = job_name;
    }

    @Override
    public String toString() {
        return "Job{" +
                "job_id=" + job_id +
                ", company=" + company +
                ", job_desc='" + job_desc + '\'' +
                ", job_name='" + job_name + '\'' +
                '}';
    }
}
