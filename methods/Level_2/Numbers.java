package com.gla.methods.Level_2;

//Write a program that generates five 4 digit random values and then finds their average
//value, and their minimum and maximum value. Use Math.random(), Math.min(), and
//Math.max().
//Hint =>
//a. Write a method that generates array of 4 digit random numbers given the size as a
//parameter as shown in the method signature
//public int[] generate4DigitRandomArray(int size)
//b. Write a method to find average, min and max value of an array
//public double[] findAverageMinMax(int[] numbers)

public class Numbers {

    public static double MinMax(double[] numbers){


        double max=numbers[0];
        double min=numbers[0];
        double sum=0;
        for(double number:numbers){
            if(number>max){
                max=number;

            }
            if(number<min){
                min=number;
            }
            sum+=number;
        }
        double average=sum/4;
        return max;






    }

    static void main(String[] args) {
        System.out.println("hi");
    }

}
