package com.university.model;

import java.util.Objects;

public class Inscription {

    private final Student student;
    private final Subject subject;

    public Inscription(Student student, Subject subject) {
        this.student = student;
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inscription that = (Inscription) o;
        return Objects.equals(student, that.student) && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, subject);
    }
}
