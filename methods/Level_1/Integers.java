package com.gla.methods;

//Write a program to check whether a number is positive, negative, or zero.
//        Hint => Get integer input from the user. Write a Method to return -1 for negative number, 1
//        for positive number and 0 if number is zero
import java.util.Scanner;
public class Integers {

    public int Integer(int n){
        if(n>0){
            System.out.println("1");
        }
        else if(n<0){
            System.out.println("-1");
        }
        else{
            System.out.println("0");
        }
        return 0;
    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        Integers i1=new Integers();
        System.out.println("Enter the number :");
        int num=s1.nextInt();
        i1.Integer(num);
    }
}
