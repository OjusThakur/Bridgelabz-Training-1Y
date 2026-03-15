package com.gla.methods.Level_2;



//Write a program to find the sum of n natural numbers using recursive method and compare
//the result with the formulae n*(n+1)/2 and show the result from both computations is correct.
//        Hint =>
//a. Take the user input number and check whether it's a Natural number
//b. Write a Method to find the sum of n natural numbers using recursion
//c. Write a Method to find the sum of n natural numbers using the formulae n*(n+1)/2
//d. Compare the two results and print the result


public class Compare {
    public static int s1(int num){
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
    public static int s2(int num){
        int s3=(num*(num+1))/2;
        return s3;

    }

    static void main(String[] args) {
        int n1=5;
        int n=s1(n1);
        if(n>0) {
            int s = s2(n1);
            System.out.println(s1(n1) == s2(n1));
        }
    }
}
