package com.university.model;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class InscriptionCounter {

    private final University university;

    public InscriptionCounter(University university) {
        this.university = university;
    }

    public List<List<String>> countInscriptions() {
        Set<Inscription> inscriptions = university.getInscriptions();

        // return StudentName, Count
        return inscriptions
                .stream()
                .collect(Collectors.groupingBy(Inscription::getStudent, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e -> List.of(e.getKey().getName(), e.getValue().toString()))
                .collect(Collectors.toList());
    }

}
