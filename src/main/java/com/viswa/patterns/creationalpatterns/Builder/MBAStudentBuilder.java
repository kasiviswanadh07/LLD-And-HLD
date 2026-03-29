package com.viswa.patterns.creationalpatterns.Builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {
    @Override
    public StudentBuilder setSubjects() {
        List<String> enggSubjectsList = new ArrayList<>();
        enggSubjectsList.add("Operating Systems");
        enggSubjectsList.add("Computer Architecture");
        enggSubjectsList.add("Data Structures");
        enggSubjectsList.add("DBMS");
        this.subjects = enggSubjectsList;
        return this;
    }
}
