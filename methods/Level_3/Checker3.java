package com.gla.methods.Level_3;

//Extend or Create a NumberChecker utility class and perform following task. Call from
//main() method the different methods and display results. Make sure all are static methods
//Hint =>
//a. Method to Check if a number is prime number. A prime number is a number greater than
//1 that has no positive divisors other than 1 and itself.
//b. Method to Check if a number is a neon number. A neon number is a number where the
//sum of digits of the square of the number is equal to the number itself
//c. Method to Check if a number is a spy number. A number is called a spy number if the
//sum of its digits is equal to the product of its digits
//d. Method to Check if a number is an automorphic number. An automorphic number is a
//number whose square ends with the number itself. E.g. 5 is an automorphic number
//e. Method to Check if a number is a buzz number. A buzz number is a number that is either
//divisible by 7 or ends with 7

public class Checker3 {public static boolean isPrime(int number) {
    if (number <= 1) return false;
    for (int i = 2; i <= Math.sqrt(number); i++)
        if (number % i == 0) return false;
    return true;
}

    public static boolean isNeonNumber(int number) {
        int square = number * number, sum = 0, temp = square;
        while (temp > 0) { sum += temp % 10; temp /= 10; }
        return sum == number;
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1, temp = number;
        while (temp > 0) {
            int d = temp % 10;
            sum += d; product *= d;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        return String.valueOf(number * number).endsWith(String.valueOf(number));
    }

    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }

    public static void main(String[] args) {
        System.out.println("Number\tPrime\tNeon\tSpy\tAutomorphic\tBuzz");
        int[] tests = {7, 9, 1, 13, 5, 132, 25, 17, 14};
        for (int n : tests) {
            System.out.println(n + "\t" + isPrime(n) + "\t" + isNeonNumber(n) + "\t"
                    + isSpyNumber(n) + "\t" + isAutomorphicNumber(n) + "\t\t" + isBuzzNumber(n));
        }
    }
}
