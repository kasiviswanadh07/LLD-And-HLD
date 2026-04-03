package com.viswa.patterns.creationalpatterns.ProtoType;

public class Student implements StudentClone {
    private int age;
    private int rollnumber;
    private String name;

    public Student(int age, int rollnumber, String name) {
        this.age = age;
        this.rollnumber = rollnumber;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public Student clone() {
        return new Student(age,rollnumber,name);
    }
}
