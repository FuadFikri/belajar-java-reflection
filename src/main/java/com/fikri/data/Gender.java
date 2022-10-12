package com.fikri.data;

public enum Gender {
    MALE("Male"),
    FEMALE("Female");


    private final String desc;


    Gender(String desc) {
        this.desc = desc;
    }
}
