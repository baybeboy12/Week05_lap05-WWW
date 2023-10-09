package com.example.entities;

import com.example.enums.SkillLevel;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "candidate_skill")
public class Candidate_Skill {
    @Id
    @ManyToOne()
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    @Id
    @OneToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;
    @Column(length = 4)
    private SkillLevel skill_Level;
    @Column(length = 1000)
    private String more_infos;

    public Candidate_Skill() {
    }

    public Candidate_Skill(Candidate candidate, Skill skill, SkillLevel skill_Level, String more_infos) {
        this.candidate = candidate;
        this.skill = skill;
        this.skill_Level = skill_Level;
        this.more_infos = more_infos;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
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
        if (!(o instanceof Candidate_Skill that)) return false;
        return Objects.equals(getCandidate(), that.getCandidate()) && Objects.equals(getSkill(), that.getSkill());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCandidate(), getSkill());
    }

    @Override
    public String toString() {
        return "Candidate_Skill{" +
                "candidate=" + candidate +
                ", skill=" + skill +
                ", skill_Level=" + skill_Level +
                ", more_infos='" + more_infos + '\'' +
                '}';
    }
}
