package com.gla.methods.Level_3;

//Extend or Create a NumberChecker utility class and perform following task. Call from
//main() method the different methods and display results. Make sure all are static methods
//Hint =>
//a. Method to find the count of digits in the number and a Method to Store the digits of the
//number in a digits array
//b. Method to reverse the digits array
//c. Method to compare two arrays and check if they are equal
//d. Method to check if a number is a palindrome using the Digits. A palindrome number is a
//number that remains the same when its digits are reversed.
//e. Method to Check if a number is a duck number using the digits array. A duck number is a
//number that has a non-zero digit present in it

public class Checker2 {
    public static int countDigits(int number) {
        int count = 0, temp = number;
        while (temp > 0) { count++; temp /= 10; }
        return count;
    }

    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        int temp = number;
        for (int i = count - 1; i >= 0; i--) { digits[i] = temp % 10; temp /= 10; }
        return digits;
    }

    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++)
            reversed[i] = digits[digits.length - 1 - i];
        return reversed;
    }

    public static boolean arraysAreEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;
        return true;
    }

    public static boolean isPalindrome(int[] digits) {
        return arraysAreEqual(digits, reverseArray(digits));
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] testNumbers = {121, 1221, 123, 1023, 12321};
        for (int number : testNumbers) {
            int[] digits = getDigits(number);
            System.out.println("Number: " + number
                    + " | Palindrome: " + isPalindrome(digits)
                    + " | Duck: " + isDuckNumber(digits));
        }
    }

}
