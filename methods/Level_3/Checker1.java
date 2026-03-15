package com.gla.methods.Level_3;

//Extend or Create a NumberChecker utility class and perform following task. Call from
//main() method the different methods and display results. Make sure all are static methods
//Hint =>
//a. Method to find the count of digits in the number and a Method to Store the digits of the
//number in a digits array
//b. Method to find the sum of the digits of a number using the digits array
//c. Method to find the sum of the squares of the digits of a number using the digits array.
//Use Math.pow() method
//d. Method to Check if a number is a harshad number using a digits array. A number is
//called a Harshad number if it is divisible by the sum of its digits. For e.g. 21
//e. Method to find the frequency of each digit in the number. Create a 2D array to store the
//frequency with digit in the first column and frequency in the second column.

public class Checker1 {
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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += (int) Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshadNumber(int number, int[] digits) {
        return number % sumOfDigits(digits) == 0;
    }

    public static int[][] findDigitFrequency(int[] digits) {
        int uniqueCount = 0;
        boolean[] counted = new boolean[10];
        for (int d : digits) if (!counted[d]) { counted[d] = true; uniqueCount++; }
        int[][] frequency = new int[uniqueCount][2];
        int index = 0;
        for (int d = 0; d <= 9; d++) {
            if (counted[d]) {
                int count = 0;
                for (int digit : digits) if (digit == d) count++;
                frequency[index][0] = d;
                frequency[index][1] = count;
                index++;
            }
        }
        return frequency;
    }

    public static void main(String[] args) {
        int number = 21;
        int[] digits = getDigits(number);
        System.out.println("Number: " + number);
        System.out.println("Sum of Digits          : " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number      : " + isHarshadNumber(number, digits));

        int freqNumber = 122334;
        int[] fd = getDigits(freqNumber);
        int[][] freq = findDigitFrequency(fd);
        System.out.println("\nFrequency for " + freqNumber + ":");
        System.out.println("Digit\tFrequency");
        for (int[] row : freq) System.out.println(row[0] + "\t" + row[1]);
    }

}
