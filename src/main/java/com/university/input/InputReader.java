package com.university.input;

import com.university.csv.CSVReader;
import com.university.csv.FileReader;
import com.university.model.*;

import java.io.File;
import java.util.List;


public class InputReader {

    public void readInput(University university) {

        final String path = "/Users/matiasmiodosky/projects/austral/prog2/tp-university-matimiodosky/src/main/resources/input.csv";

        final FileReader fileReader = new FileReader(path);
        final CSVReader csvReader = new CSVReader(fileReader);

        final int lines = fileReader.countLines();

        for (int i = 2; i <= lines; i++) {
            List<String> line = csvReader.readCSVLine(i);

            // input columns: Classroom,Subject,Student_Name,Student_Email,Subject_Teacher

            Classroom classroom = new Classroom(Integer.parseInt(line.getFirst()));
            Teacher teacher = new Teacher(line.get(4));
            Subject subject = new Subject(line.get(1), teacher, classroom);
            Student student = new Student(line.get(2), line.get(3));
            Inscription inscription = new Inscription(student, subject);


            university.addClass(subject);
            university.addStudent(student);
            university.addTeacher(teacher);
            university.addClassroom(classroom);
            university.addInscription(inscription);
        }

    }

}
