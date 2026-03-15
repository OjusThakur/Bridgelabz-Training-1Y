package com.gla.methods;

//Create a program to find the maximum number of handshakes among students.
//Hint =>
//a. Get integer input for the numberOfStudents variable.
//b. Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of
//possible handshakes.
//c. Write a method to use the combination formulae to calculate the number of handshakes
//d. Display the number of possible handshakes.
import java.util.Scanner;
public class Handshakes {

    public void calculator(int n){
        int handshake=(n*(n-1))/2;
        System.out.println("Total number of handshakes are "+handshake);

    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter Number of people : ");
        int num=s1.nextInt();
        Handshakes c1=new Handshakes();
        c1.calculator(num);
    }
}
