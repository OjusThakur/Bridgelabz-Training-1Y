package com.gla.methods.Level_3;

public class Checker4 { public static int sumOfProperDivisors(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) if (number % i == 0) sum += i;
    return sum;
}

    public static boolean isPerfectNumber(int number)   { return sumOfProperDivisors(number) == number; }
    public static boolean isAbundantNumber(int number)  { return sumOfProperDivisors(number) > number; }
    public static boolean isDeficientNumber(int number) { return sumOfProperDivisors(number) < number; }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0, temp = number;
        while (temp > 0) { sum += factorial(temp % 10); temp /= 10; }
        return sum == number;
    }

    public static void main(String[] args) {
        System.out.println("Perfect numbers up to 1000:");
        for (int i = 1; i <= 1000; i++) if (isPerfectNumber(i)) System.out.print(i + " ");
        System.out.println("\n\nStrong numbers up to 100000:");
        for (int i = 1; i <= 100000; i++) if (isStrongNumber(i)) System.out.print(i + " ");
        System.out.println();
        System.out.println("\n28 Perfect: " + isPerfectNumber(28));
        System.out.println("12 Abundant: " + isAbundantNumber(12));
        System.out.println("8 Deficient: " + isDeficientNumber(8));
        System.out.println("145 Strong: " + isStrongNumber(145));
    }
}
