package com.gla.methods.Level_2;

//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do
//the following. Please define static methods for all the UnitConvertor class methods. E.g.
//public static double convertYardsToFeet(double yards) =>
//a. Method to convert yards to feet and return the value. Use following code to convert
//double yards2feet = 3;
//b. Method to convert feet to yards and return the value. Use following code to convert
//double feet2yards = 0.333333;
//c. Method to convert meters to inches and return the value. Use following code to convert
//double meters2inches = 39.3701;
//d. Method to convert inches to meters and return the value. Use following code to convert
//double inches2meters = 0.0254;
//e. Method to convert inches to centimeters

public class Converter1 {
    public static double convertyardstofeet(double yards){
        double yards2feet = 3      ;
        double feet=yards*yards2feet;
        System.out.println(feet);
        return feet;
    }
    public static double convertfeettoyards(double feet){
        double feet2yards = 0.333333;
        double feet1=feet2yards*feet;
        System.out.println(feet1);
        return feet1;
    }
    public static double convertmeterstoinches(double meters){
        double meters2inches = 39.3701;
        double inches=meters2inches*meters;
        System.out.println(inches);
        return inches;
    }
    public static double convertinchestometers(double inches){
        double inches2meters = 0.0254;
        double meters1=inches2meters*inches;
        System.out.println(meters1);
        return meters1;
    }

    static void main(String[] args) {
        int yards=100;
        int meters=100000;
        convertyardstofeet(yards);
        convertfeettoyards(convertyardstofeet(yards));
        convertmeterstoinches(meters);
        convertinchestometers(convertmeterstoinches(meters));

    }
}
