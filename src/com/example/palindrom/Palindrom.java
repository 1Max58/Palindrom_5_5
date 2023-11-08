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
        boolean result = true;
        for (int i = 0; i < wordLowerCase.length() / 2; i++) {
            if (wordLowerCase.charAt(i) != wordLowerCase.charAt(wordLowerCase.length() - i - 1)) {
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Typed word is a palindrom");
        }
        else {
            System.out.println("Typed word is not a palindrom");
        }
    }
}
