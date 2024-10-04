package com.university.csv;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {

    private final String path;

    public FileReader(String path) {
        this.path = path;
    }

    public String readLine(int lineNumber) {
        if (lineNumber <= 0) {
            throw new IllegalArgumentException("lineNumber must be positive");
        }
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line;
            int currentLine = 0;
            while ((line = reader.readLine()) != null) {
                currentLine++;
                if (currentLine == lineNumber) {
                    return line;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("lineNumber is too large");
    }

    public int countLines() {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            int lines = 0;
            while (reader.readLine() != null) {
                lines++;
            }
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new IllegalArgumentException("File not found");
    }

}
