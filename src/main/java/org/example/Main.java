package org.example;


public class Main {
    public static void main(String[] args) {
        PhoneBook.add("Sveta", 645248);
        PhoneBook.add("Vera", 645246);
        PhoneBook.add("Petya", 529405);
        PhoneBook.add("Vitya", 150283);
        System.out.println(PhoneBook.findByNumber(645148));
        System.out.println(PhoneBook.findByNumber(645248));

    }
}