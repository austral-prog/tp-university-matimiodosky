package com.university.csv;

import java.util.List;

public class CSVReader {

    private final FileReader fileReader;

    public CSVReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    public List<String> readCSVLine(int lineNumber) {
        String line = fileReader.readLine(lineNumber);
        return List.of(line.split(","));
    }

}
