package com.gla.methods.Level_2;


//Create a program to find the factors of a number taken as user input, store the factors in an
//array, and display the factors. Also find the sum, sum of square of factors and product of the
//factors and display the results
//Hint =>
//a. Take the input for a number
//b. Write a static Method to find the factors of the number and save them in an array and
//return the array.
//c. To find factors and save to array will have two loops. The first loop to find the count and
//initialize the array with the count. And the second loop save the factors into the array
//d. Write a method to find the sum of the factors using factors array
//e. Write a method to find the product of the factors using factors array
//f. Write a method to find the sum of square of the factors using Math.pow() method

public class Factors {
    public static void factors(int num){
        int fact=1;
        int[] arr=new int[num];

        for(int i=1;i<=num;i++){
            if(num%i==0){
            arr[i-1]=i;
            }
        }
        int sum=0;
        for(int number:arr){
            sum+=number;
        }
        int pro=1;
        for(int i=1;i<=num;i++){

                pro*=i;}

        int s1=0;

        for(int number:arr){
            s1+=Math.pow(number,2);
        }


        for(int number:arr){
            System.out.print(" "+number);
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(pro);
        System.out.println(s1);

    }

    static void main(String[] args) {
        factors(10);
    }
}
