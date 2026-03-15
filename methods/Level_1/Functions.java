package com.gla.methods;

//Write a program to calculate various trigonometric functions using Math class given an angle
//        in degrees
//        Hint =>
//a. Method to calculate various trigonometric functions, Firstly convert to radians and then
//use Math function to find sine, cosine and tangent.

public class Functions {
    public static void Trigonometric(double angle){
        double radion=Math.toRadians(angle);

        double sin=Math.sin(radion);
        double cos=Math.cos(radion);
        double tan=Math.tan(radion);

        System.out.println(sin);
        System.out.println(cos);
        System.out.println(tan);
    }

    static void main(String[] args) {
        Trigonometric(45);
    }
}
