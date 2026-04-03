package com.viswa.patterns.creationalpatterns.ProtoType;

public class Main {
    public static void main(String[] args) {
        Student obj=new Student(25, 366, "kasi viswanadh");
        Student cloneobj=obj.clone();

    }
}
