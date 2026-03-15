package com.gla.methods;

//Write a program SpringSeason that takes two int values month and day from the command
//line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”.
//Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring
//season and return a boolean true or false

import java.util.Scanner;
public class Season {
    public static void date(int d, int m){
        boolean t=true;
        boolean f=false;
        if((d>=20)&&(d<=31)&&(m==3)){
            System.out.println(t);
        }
        else if((d>=1)&&(d<=31)&&(m>3)&&(m<6)) {
            System.out.println(t);

        }
        else if((d>=1)&&(d<=20)&&(m==6)){
            System.out.println(t);
        }
        else {
            System.out.println(f);
        }

    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter date : ");
        int d=s1.nextInt();
        System.out.println("Enter Month : ");
        int m=s1.nextInt();
        date(d,m);
    }

}
