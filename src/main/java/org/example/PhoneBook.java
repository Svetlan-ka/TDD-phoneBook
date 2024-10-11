package org.example;

import java.util.HashMap;

public class PhoneBook {
    private static PhoneBook INSTANCE = null;
    HashMap<String, Integer> phoneBook = new HashMap<>();

    private PhoneBook () {}

    public static PhoneBook getInstance() {
        if (INSTANCE == null) INSTANCE = new PhoneBook();
        return INSTANCE;
    }

    public static int add(String name, Integer number) {
        return 0;
    }
}
