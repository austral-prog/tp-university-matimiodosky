package com.university.model;

import java.util.Objects;

public class Classroom {

    private final int number;

    public Classroom(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return number == classroom.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}
