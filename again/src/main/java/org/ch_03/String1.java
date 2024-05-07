package org.ch_03;

public class String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // length of String
        System.out.println(s.length());

        // letters change (toUpperCase() and toLowerCase();
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // check the includes

        // if contains "Java" become true;
        System.out.println(s.contains("Java"));

        // if not it comes false;
        System.out.println(s.contains("m"));
    }
}
