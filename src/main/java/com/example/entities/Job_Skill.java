package com.example.entities;

import com.example.enums.SkillLevel;
import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "job_skill")
public class Job_Skill {
    @Id
    @ManyToOne()
    @JoinColumn(name = "job_id")
    private Job job;
    @Id
    @ManyToOne()
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Column(length = 4)
    private SkillLevel skill_Level;
    @Column(length = 1000)
    private String more_infos;

    public Job_Skill(Job job, Skill skill, SkillLevel skill_Level, String more_infos) {
        this.job = job;
        this.skill = skill;
        this.skill_Level = skill_Level;
        this.more_infos = more_infos;
    }

    public Job_Skill() {
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public SkillLevel getSkill_Level() {
        return skill_Level;
    }

    public void setSkill_Level(SkillLevel skill_Level) {
        this.skill_Level = skill_Level;
    }

    public String getMore_infos() {
        return more_infos;
    }

    public void setMore_infos(String more_infos) {
        this.more_infos = more_infos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job_Skill jobSkill)) return false;
        return Objects.equals(getJob(), jobSkill.getJob()) && Objects.equals(getSkill(), jobSkill.getSkill());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJob(), getSkill());
    }

    @Override
    public String toString() {
        return "Job_Skill{" +
                "job=" + job +
                ", skill=" + skill +
                ", skill_Level=" + skill_Level +
                ", more_infos='" + more_infos + '\'' +
                '}';
    }
}
