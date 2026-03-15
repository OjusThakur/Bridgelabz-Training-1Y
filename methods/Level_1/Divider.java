package com.gla.methods;


/*Write a program to take 2 numbers and print their quotient and reminder
Hint =>
a. Take user input as integer
b. Use division operator (/) for quotient and moduli operator (%) for reminder
c. Write Method to find the reminder and the quotient of a number
public static int[] findRemainderAndQuotient(int number, int divisor)*/


import java.util.Scanner;
public class Divider {
    public static void divide(int n1, int n2){
        int quo,rem;
        if(n1>n2){
            quo=n1/n2;
            rem=n1%n2;
        }
        else{
            quo=n2/n1;
            rem=n2%n1;
        }
        System.out.println("quotient is "+quo+"and remainder is "+rem);
    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter n1 : ");
        int n1=s1.nextInt();
        System.out.println("Enter n2 : ");
        int n2=s1.nextInt();
        divide(n1,n2);
    }
}
