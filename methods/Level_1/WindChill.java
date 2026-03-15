package com.gla.methods;




//Write a program calculate the wind chill temperature given the temperature and wind speed
//Hint =>
//a. Write a method to calculate the wind chill temperature using the formula
//windChill = 35. 74 + 0. 6215 * temp + (0. 4275 * temp − 35. 75) * windSpeed
//0.16


import java.util.Scanner;
public class WindChill {
    public void Calculator(double temp, double windspeed){
        double windchil=35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windspeed,0.16);
        System.out.println(windchil);
    }

    static void main(String[] args) {
        WindChill c1=new WindChill();
        c1.Calculator(45,20);
    }
}
