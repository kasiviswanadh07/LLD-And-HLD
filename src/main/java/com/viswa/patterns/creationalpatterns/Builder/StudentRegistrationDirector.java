package com.viswa.patterns.creationalpatterns.Builder;

public class StudentRegistrationDirector {
    StudentBuilder studentBuilder;

    public StudentRegistrationDirector(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createMBAStudent() {
        return studentBuilder.setAge(24)
                .setRollNumber(2) // MBAStudentBuilder
                .setName("Sarah")
                .setFatherName("Gabriel")
                .setMotherName("Taylor")
                .setBranch("Business Administration")
                .setSubjects() // MBA-specific method
                .setMobileNo("9876543210")
                .setEmailId("sarahgabriel@iitb.com")
                .build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(1) //
                .setAge(22)
                .setName("John")
                .setFatherName("Paul")
                .setMotherName("Jane")
                .setBranch("Computer Science and Engineering")
                .setSubjects() // Engineering-specific method
                .build();
    }
}