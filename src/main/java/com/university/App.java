package com.university;

import com.university.csv.CSVWriter;
import com.university.input.InputReader;
import com.university.model.InscriptionCounter;
import com.university.model.Student;
import com.university.model.University;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static com.university.util.Util.mapToList;

public class App {
    public static void main(String[] args) {
        University university = new University();
        InputReader inputReader = new InputReader();
        inputReader.readInput(university);

        InscriptionCounter inscriptionCounter = new InscriptionCounter(university);
        List<List<String>> counts = inscriptionCounter.countInscriptions();

        counts.sort(Comparator.comparing(List::getFirst));

        CSVWriter csvWriter = new CSVWriter("/Users/matiasmiodosky/projects/austral/prog2/tp-university-matimiodosky/src/main/resources/output.csv");

        csvWriter.writeCSV(
                List.of("Student_Name", "Course_Count"),
                counts
        );
    }
}
