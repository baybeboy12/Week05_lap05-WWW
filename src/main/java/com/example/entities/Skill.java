package com.example.entities;

import com.example.enums.SkillType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Skill {
    @Id
    @Column(length = 20)
    private long skill_id;
    @Column(columnDefinition = "tinyint",length = 4)
    private SkillType skill_type;
    @Column(length = 150)
    private  String skill_name;
    @Column(length = 300)
    private String skill_desc;
    @OneToMany
    private List<Job_Skill> jobSkills;

    public Skill() {
    }

    public Skill(long skill_id, SkillType skill_type, String skill_name, String skill_desc) {
        this.skill_id = skill_id;
        this.skill_type = skill_type;
        this.skill_name = skill_name;
        this.skill_desc = skill_desc;
    }

    public long getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(long skill_id) {
        this.skill_id = skill_id;
    }

    public SkillType getSkill_type() {
        return skill_type;
    }

    public void setSkill_type(SkillType skill_type) {
        this.skill_type = skill_type;
    }

    public String getSkill_name() {
        return skill_name;
    }

    public void setSkill_name(String skill_name) {
        this.skill_name = skill_name;
    }

    public String getSkill_desc() {
        return skill_desc;
    }

    public void setSkill_desc(String skill_desc) {
        this.skill_desc = skill_desc;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "skill_id=" + skill_id +
                ", skill_type=" + skill_type +
                ", skill_name='" + skill_name + '\'' +
                ", skill_desc='" + skill_desc + '\'' +
                '}';
    }
}
