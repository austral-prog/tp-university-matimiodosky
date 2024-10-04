package com.university.csv;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class CSVWriter {

    private final String path;

    public CSVWriter(String path) {
        this.path = path;
    }

    public void writeCSV(List<String> headers, List<List<String>> data) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {
            // Write headers
            writer.write(headers.stream()
                    .map(this::escapeCSV)
                    .collect(Collectors.joining(",")));
            writer.newLine();

            // Write data rows
            for (List<String> row : data) {
                String line = row.stream()
                        .map(this::escapeCSV)
                        .collect(Collectors.joining(","));
                writer.write(line);
                writer.newLine();
            }
            writer.write("");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String escapeCSV(String field) {
        if (field.contains("\"")) {
            field = field.replace("\"", "\"\"");
        }
        if (field.contains(",") || field.contains("\n") || field.contains("\"")) {
            field = "\"" + field + "\"";
        }
        return field;
    }
}