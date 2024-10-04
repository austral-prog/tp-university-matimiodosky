package com.university.model;

import java.util.Objects;

public class Subject {

    private final String name;
    private final Teacher teacher;
    private final Classroom classroom;


    public Subject(String name, Teacher teacher, Classroom classroom) {
        this.name = name;
        this.teacher = teacher;
        this.classroom = classroom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
