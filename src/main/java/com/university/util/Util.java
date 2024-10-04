package com.university.util;

import java.util.List;
import java.util.Map;

public class Util {

    public static List<List<String>> mapToList(Map<String, Integer> data) {
        // Map the headers and data to a list
        return data
                .entrySet()
                .stream()
                .map(e -> List.of(e.getKey(), e.getValue().toString()))
                .toList();
    }
}
