package com.university.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class University {

    private final Set<Student> students;
    private final Set<Teacher> teachers;
    private final Set<Classroom> classrooms;
    private final Set<Subject> classes;
    private final Set<Inscription> inscriptions;

    public University(Set<Student> students, Set<Teacher> teachers, Set<Classroom> classrooms, Set<Subject> classes, Set<Inscription> inscriptions) {
        this.students = students;
        this.teachers = teachers;
        this.classrooms = classrooms;
        this.classes = classes;
        this.inscriptions = inscriptions;
    }

    public University() {
        this.students = new HashSet<>();
        this.teachers = new HashSet<>();
        this.classrooms = new HashSet<>();
        this.classes = new HashSet<>();
        this.inscriptions = new HashSet<>();
    }

    public Set<Student> getStudents() {
        return students;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    public Set<Classroom> getClassrooms() {
        return classrooms;
    }

    public Set<Subject> getClasses() {
        return classes;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addClassroom(Classroom classroom) {
        classrooms.add(classroom);
    }

    public void addClass(Subject class_) {
        classes.add(class_);
    }

    public void addInscription(Inscription inscription) {
        inscriptions.add(inscription);
    }

    public Set<Inscription> getInscriptions() {
        return inscriptions;
    }
}
