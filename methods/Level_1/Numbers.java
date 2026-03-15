package com.gla.methods;

//Write a program to find the smallest and the largest of the 3 numbers.
//        Hint =>
//        a. Take user input for 3 numbers
//        b. Write a single method to find the smallest and largest of the three numbers


import java.util.Scanner;
public class Numbers {
    public void check(int a, int b, int c){
        if(a>b&&a>c){
            System.out.println("a is Largest");
        }
        else if(b>a&&b>c){
            System.out.println("b is Largest");
        }
        else{
            System.out.println("c is Largest");
        }
    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter a : ");
        int a=s1.nextInt();
        System.out.println("Enter b : ");
        int b=s1.nextInt();
        System.out.println("Enter c : ");
        int c=s1.nextInt();
        Numbers n1= new Numbers();
        n1.check(a,b,c);

    }
}
