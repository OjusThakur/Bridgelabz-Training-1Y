package com.gla.objectandclass.level_2;

//Program to Check Palindrome String
//Problem Statement: Create a PalindromeChecker class with an attribute text. Add
//methods to:
//        ● Check if the text is a palindrome.
//● Display the result.
//        Explanation: The PalindromeChecker class holds the text attribute. The methods
//operate on this attribute to verify its palindrome status and display the result.


public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public String getText()          { return text; }
    public void   setText(String t)  { this.text = t; }

    public boolean isPalindrome() {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public void displayResult() {
        System.out.println("  Text     : \"" + text + "\"");
        if (isPalindrome()) {
            System.out.println("  Result   : ✔ It IS a palindrome.");
        } else {
            System.out.println("  Result   : ✘ It is NOT a palindrome.");
        }
    }

    public static void main(String[] args) {
        String[] testWords = {"madam", "racecar", "hello", "level", "Java", "Refer", "noon"};

        System.out.println("=== Palindrome Checker ===\n");
        for (String word : testWords) {
            PalindromeChecker checker = new PalindromeChecker(word);
            checker.displayResult();
            System.out.println();
        }

        PalindromeChecker phraseChecker = new PalindromeChecker("A man a plan a canal Panama");
        System.out.println("--- Phrase Test ---");
        phraseChecker.displayResult();
    }
}
