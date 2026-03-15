package com.gla.methods;

//An athlete runs in a triangular park with sides provided as input by the user in meters. If the
//athlete wants to complete a 5 km run, then how many rounds must the athlete complete
//Hint =>
//a. Take user input for 3 sides of a triangle
//b. The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
//c. Write a Method to compute the number of rounds user needs to do to complete 5km run
import java.util.Scanner;
public class Athlete {

    public static void round(int s1,int s2, int s3){
        double dist=5;
        double per=s1+s2+s3;
        double rounds=per/dist;
        System.out.println("Total number of rounds "+rounds);
    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter 1st Side : ");
        int n1=s1.nextInt();
        System.out.println("Enter 2nd Side : ");
        int n2=s1.nextInt();
        System.out.println("Enter 3rd Side : ");
        int n3=s1.nextInt();
        round(n1,n2,n3);
    }
}
