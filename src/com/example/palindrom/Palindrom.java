package com.example.palindrom;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        System.out.println("This program checks if typed word is a palindrom.");
        System.out.print("Please enter a word: ");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String wordLowerCase = word.toLowerCase();
        System.out.println("Word after letters changed to lowercase: " + wordLowerCase);
    }
}
