package com.gla.methods.Level_2;

//Write a program to take user input for 5 numbers and check whether a number is positive or
//negative. Further for positive numbers check if the number is even or odd. Finally compare
//the first and last elements of the array and display if they are equal, greater, or less
//Hint =>
//a. Write a Method to Check whether the number is positive or negative
//b. Write a Method to check whether the number is even or odd
//c. Write a Method to compare two numbers and return 1 if number1 > number2 or 0 if both
//are equal or -1 if number1 < number2
//d. In the main program, Loop through the array using the length call the method
//isPositive() and if positive call method isEven() and print accordingly
//e. If the number is negative, print negative.
//f. Finally compare the first and last element of the array by calling the method compare()
//and display if they are equal, greater, or less

import java.util.Scanner;
public class Integer {
    public static void integer(int[] num) {

        for (int number : num) {
            if (number > 0) {

                System.out.println("num is positive");


            } else {
                System.out.println("num is negative");
            }

        }
    }

    public static void evenandodd(int[] num) {
        for (int number : num) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println("num is even");

                } else {
                    System.out.println("num is odd");
                }
            }
        }

    }
    public static void compare(int[] num){
        if (num[0]>num[4]){
            System.out.println("1");
        }
        else{
            System.out.println("-1");
        }
    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int[] num=new int[5];
        for(int i=0;i<5;i++){
            num[i]=s1.nextInt();
        }
        integer(num);
        evenandodd(num);
        compare(num);
    }
}