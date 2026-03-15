package com.gla.methods.Level_3;

//Write a program to find the factors of a number and perform various tasks using the factors
//        array
//Hint =>
//a. Method to find factors of a number and return them as an array. Note there are 2 for
//loops: one for the count and another for finding the factor and storing in the array
//b. Method to find the greatest factor of a Number using the factors array
//
//4
//
//c. Method to find the sum of the factors using factors array and return the sum
//d. Method to find the product of the factors using factors array and return the product
//e. Method to find the product of the cube of the factors using the factors array. Use
//Math.pow()

public class Factors {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) count++;
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) if (number % i == 0) factors[index++] = i;
        return factors;
    }

    public static int findGreatestFactor(int[] factors) { return factors[factors.length - 1]; }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int f : factors) product *= Math.pow(f, 3);
        return product;
    }

    public static void main(String[] args) {
        int number = 12;
        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + ": ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nGreatest Factor      : " + findGreatestFactor(factors));
        System.out.println("Sum of Factors       : " + sumOfFactors(factors));
        System.out.println("Product of Factors   : " + productOfFactors(factors));
        System.out.printf("Product of Cube      : %.0f%n", productOfCubeOfFactors(factors));
    }
}
