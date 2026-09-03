package com.example.practical_exam;

public class Main extends  ReverseLetter{
    public static void main(String[] args) {
        char[] letters = "Hello , world !".toCharArray();
        ReverseLetter subClass = new ReverseLetter();
        System.out.println(subClass.reverseLetter(letters));
    }
}
