package com.gla.methods.Level_2;

//Write a program that takes a year as input and outputs the Year is a Leap Year or not
//Hint =>
//a. The LeapYear program only works for year >= 1582, corresponding to a year in the
//Gregorian calendar.
//b. Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
//c. Write a method to check for Leap Year using the conditions a and b

public class LeapYear {
    public void year(int year){
        if(year%100!=0&&year%4==0){
            System.out.println("Leap Year");
        }
        else if(year%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }

    static void main(String[] args) {
        LeapYear l1=new LeapYear();
        int year=2024;
        if(year>=1582){
            l1.year(year);
        }
    }

}
