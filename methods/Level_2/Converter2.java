package com.gla.methods.Level_2;

//Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do
//the following. Please define static methods for all the UnitConvertor class methods. E.g.
//public static double convertFarhenheitToCelsius(double farhenheit) =>
//a. Method to convert Fahrenheit to Celsius and return the value. Use the following code
//double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
//b. Method to convert Celsius to Fahrenheit and return the value. Use the following code
//double celsius2farhenheit = (celsius * 9 / 5) + 32;
//c. Method to convert pounds to kilograms and return the value. Use the following code
//double pounds2kilograms = 0.453592;
//d. Method to convert kilograms to pounds and return the value. Use the following code
//double kilograms2pounds = 2.20462;
//e. Method to convert gallons to liters and return the value. Use following code to convert
//double gallons2liters = 3.78541;
//f. Method to convert liters to gallons and return the value. Use following code to convert
//double liters2gallons = 0.264172;

public class Converter2 {
    public static double convertfarhenheittocelsius(double farhenheit){
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;

        System.out.println(farhenheit2celsius);
        return farhenheit2celsius;
    }
    public static double convertcelsiustofarhenheit(double celsius){
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius2farhenheit);
        return celsius2farhenheit;
    }
    public static double convertpoundstokilograms(double pounds){
        double pounds2kilograms = 0.453592;
        double kilograms=pounds2kilograms*pounds;
        System.out.println(kilograms);
        return kilograms;
    }
    public static double convertkilogramstopounds(double kilogram){
        double kilograms2pounds = 2.20462;
        double pounds1=kilograms2pounds*kilogram;
        System.out.println(pounds1);
        return pounds1;
    }
    public static double convertgallonstoliters(double gallons){
        double gallons2liters = 3.78541;
        double liters=gallons2liters*gallons;
        System.out.println(liters);
        return liters;
    }
    public static double convertliters2gallons(double liters){
        double liters2gallons = 0.264172;
        double gallons1=liters2gallons*liters;
        System.out.println(gallons1);
        return gallons1;
    }

    static void main(String[] args) {
        int farhenheit=100;
        int pounds=1000;
        int gallons=100;
        convertfarhenheittocelsius(farhenheit);
        convertcelsiustofarhenheit(convertfarhenheittocelsius(farhenheit));
        convertpoundstokilograms(pounds);
        convertkilogramstopounds(convertpoundstokilograms(pounds));
        convertgallonstoliters(gallons);
        convertliters2gallons(convertgallonstoliters(gallons));

    }}
