package com.gla.methods.Level_2;


//Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on
//their ages and tallest among the friends based on their heights and display it
//Hint =>
//a. Take user input for age and height for the 3 friends and store it in two arrays each to
//store the values for age and height of the 3 friends
//b. Write a Method to find the youngest of the 3 friends
//c. Write a Method to find the tallest of the 3 friends

import java.util.Scanner;
public class Youngest {
    public static void age(int[] age){
        if(age[0]<age[1]&&age[0]<age[2]){
            System.out.println("1st friend is youngest ");
        }
        else if(age[1]<age[0]&&age[1]<age[2]){
            System.out.println("2nd friend is youngest ");

        }
        else {
            System.out.println("3rd friend is youngest ");

        }



    }
    public static void height(int[] height) {
        if (height[0] > height[1] && height[0] > height[2]) {
            System.out.println("1st friend is tallest ");
        } else if (height[1] > height[0] && height[1] > height[2]) {
            System.out.println("2nd friend is tallest ");

        } else {
            System.out.println("3rd friend is tallest ");
        }
    }

    static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int[] age=new int[3];
        int[] height=new int[3];
        for(int i=0;i<3;i++){
            age[i]= s1.nextInt();}
        for(int i=0;i<3;i++){
            height[i]= s1.nextInt();}
        age(age);
        height(height);

    }
}
