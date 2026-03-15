package com.gla.methods.Level_2;

//Write a program Quadratic to find the roots of the equation ax . Use Math
//
//2
//        + bx + c
//
//functions Math.pow() and Math.sqrt()
//Hint =>
//        a. Take a, b, and c as input values to find the roots of x.
//b. The roots are computed using the following formulae
//delta = b
//2
//        + 4 * a * c
//
//If delta is positive the find the two roots using formulae
//root1 of x = (− b + delta)/(2 * a)
//root1 of x = (− b − delta)/(2 * a)
//If delta is zero then there is only one root of x
//root of x = − b/(2 * a)
//If delta is negative return empty array or nothing
//c. Write a Method to find find the roots of a quadratic equation and return the roots

public class Quadratic {
    public static void roots(int a,int b,int c){
        double po=Math.pow(b,2);
        double delta= po+(4*a*c);
        double sq=Math.sqrt(delta);
        if(delta>0){
            double root1=(-b+sq)/(2*a);
            double root2=(-b-sq)/(2*a);
        }
        if(delta==0){
            int root= -b/(2 * a);
        }

    }

    static void main(String[] args) {
        int a=1;
        int b=3;
        int c=1;
        roots(a,b,c);
    }
}
