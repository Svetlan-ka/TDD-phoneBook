package org.example;

import java.lang.management.OperatingSystemMXBean;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class PhoneBook {
    private static PhoneBook INSTANCE = null;
    static Map<String, Integer> phoneBook = new TreeMap<>();

    private PhoneBook() {
    }

    public static PhoneBook getInstance() {
        if (INSTANCE == null) INSTANCE = new PhoneBook();
        return INSTANCE;
    }

    public static int add(String name, Integer number) {
        phoneBook.put(name, number);
        return phoneBook.size();
    }

    public static String findByNumber(int number) {
        Optional<String> result = phoneBook.entrySet().stream()
                .filter(entry -> number == entry.getValue())
                .map(Map.Entry::getKey)
                .findFirst();
        return result.orElse(null);
    }

    public static Integer findByName(String name) {
        Optional<Integer> result = Optional.ofNullable(phoneBook.get(name));
        return result.orElse(null);
    }

    public static void printAllNames() {
        for (String name : phoneBook.keySet()) {
            System.out.println(name);
        }
    }
}
