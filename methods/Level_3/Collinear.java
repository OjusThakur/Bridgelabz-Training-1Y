package com.gla.methods.Level_3;

//Write a program to find the 3 points that are collinear using the slope formulae and area of
//triangle formulae. check A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling.
//        Hint =>
//a. Take inputs for 3 points x1, y1, x2, y2, and x3, y3
//b. Write a Method to find the 3 points that are collinear using the slope formula. The 3
//points A(x1,y1), b(x2,y2), and c(x3,y3) are collinear if the slopes formed by 3 points ab,
//bc, and cd are equal.
//slope AB = (y2 − y1)/(x2 − x1), slope BC = (y3 − y2)/(x3 − x3)
//slope AC = (y3 − y1)/(x3 − x1) Points are collinear if
//slope AB = slope BC = slope Ac
//c. The method to find the three points is collinear using the area of the triangle formula.
//The Three points are collinear if the area of the triangle formed by three points is 0. The
//area of a triangle is
//
//        area = 0. 5 * (x1 * (y2 − y3) + x2 * (y3 − y1) + x3 * (y1 − y2))

public class Collinear { public static boolean areCollinearBySlope(double x1, double y1,
                                                                   double x2, double y2,
                                                                   double x3, double y3) {
    double slopeAB = (y2 - y1) / (x2 - x1);
    double slopeBC = (y3 - y2) / (x3 - x2);
    double epsilon = 1e-9;
    return Math.abs(slopeAB - slopeBC) < epsilon;
}

    public static boolean areCollinearByArea(double x1, double y1,
                                             double x2, double y2,
                                             double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return Math.abs(area) < 1e-9;
    }

    public static void main(String[] args) {
        System.out.println("--- A(2,4) B(4,6) C(6,8) ---");
        System.out.println("Collinear by Slope: " + areCollinearBySlope(2,4,4,6,6,8));
        System.out.println("Collinear by Area : " + areCollinearByArea(2,4,4,6,6,8));
        System.out.println("\n--- A(1,1) B(2,3) C(4,5) ---");
        System.out.println("Collinear by Slope: " + areCollinearBySlope(1,1,2,3,4,5));
        System.out.println("Collinear by Area : " + areCollinearByArea(1,1,2,3,4,5));
    }
}
