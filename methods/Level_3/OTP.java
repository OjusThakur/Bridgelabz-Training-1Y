package com.gla.methods.Level_3;

//Write a program to generate a six-digit OTP number using Math.random() method. Validate
//the numbers are unique by generating the OTP number 10 times and ensuring all the 10
//OTPs are not the same
//Hint =>
//a. Write a method to generate a 6-digit OTP number using Math.random()
//b. Create an array to save the OTP numbers generated 10 times
//c. Write a method to ensure that the OTP numbers generated are unique. If unique return
//        true else return false

public class OTP {
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static int[] generateTenOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) otps[i] = generateOTP();
        return otps;
    }

    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++)
            for (int j = i + 1; j < otps.length; j++)
                if (otps[i] == otps[j]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] otps = generateTenOTPs(10);
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
    }
}
