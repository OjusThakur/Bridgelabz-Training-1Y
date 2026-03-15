package com.gla.methods.Level_2;

//Write a program to take user input for the age of all 10 students in a class and check
//        whether the student can vote depending on his/her age is greater or equal to 18.
//Hint =>
//a. Create a class public class StudentVoteChecker and define a method public
//boolean canStudentVote(int age) which takes in age as a parameter and returns
//true or false
//b. Inside the method firstly validate the age for a negative number, if a negative return is
//false cannot vote. For valid age check for age is 18 or above return true; else return
//        false;
//c. In the main function define an array of 10 integer elements, loop through the array by
//take user input for the student's age, call canStudentVote() and display the result


import java.util.Scanner;
public class Vote {
    public void eligibilty(int[] age){
        for(int number:age){
            if (number>=18){
                System.out.println(true);            }
            else{
                System.out.println(false);            }

        }
        System.out.println(true);

    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int[] age=new int[10];
        for(int i=0;i<10;i++){
            age[i]= s1.nextInt();
        }
        Vote v1=new Vote();
        v1.eligibilty(age);
    }

}
