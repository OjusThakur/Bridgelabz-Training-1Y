package com.gla.methods;


//Create a program to divide N number of chocolates among M children. Print the number of
//        chocolates each child will get and also the remaining chocolates
//        Hint =>
//        a. Get an integer value from user for the numberOfchocolates and numberOfChildren.
//        b. Write the method to find the number of chocolates each child gets and number of
//        remaining chocolates



import java.util.Scanner;


public class Chocolates {
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
        System.out.println("Number of chocolates each child gets "+quo+", Number of Chocolates Remaining "+rem);
    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter no. of Students : ");
        int n1=s1.nextInt();
        System.out.println("Enter no. of Chocolates : ");
        int n2=s1.nextInt();
        divide(n1,n2);
    }
}
