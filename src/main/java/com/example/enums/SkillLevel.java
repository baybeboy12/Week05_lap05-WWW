package com.example.enums;

public enum SkillLevel {

    MASTER(0),
    BEGINER(1),
    ADVANCED(2),
    PROFESSIONAL(3),
    IMTERMEDIATE(4)
    ;

    private int value;

    SkillLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
