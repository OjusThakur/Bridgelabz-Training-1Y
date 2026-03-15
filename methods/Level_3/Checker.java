package com.gla.methods.Level_3;

//Extend or Create a NumberChecker utility class and perform following task. Call from
//main() method the different methods and display results. Make sure all are static methods
//Hint =>
//a. Method to Find the count of digits in the number
//b. Method to Store the digits of the number in a digits array
//c. Method to Check if a number is a duck number using the digits array. A duck number is a
//number that has a non-zero digit present in it
//d. Method to check if the number is a armstrong number using the digits array. Armstrong
//number is a number that is equal to the sum of its own digits raised to the power of the
//number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
//e. Method to find the largest and second largest elements in the digits array. Use
//Integer.MIN_VALUE to initialize the variable.
//f. Method to find the the smallest and second smallest elements in the digits array. Use
//Integer.MAX_VALUE to initialize the variable.

public class Checker {
    public static int count(int num){
        int count=0;
        while (num!=0){
            int temp=num%10;
            count+=temp;
            num=num/10;
        }
        return count;

    }
    public static int[] array(int num){
        int[] arr=new int[num];
        int i=0;
        while (num!=0){
            while(num!=0){
                int temp=num%10;
                arr[i]=temp;
                i++;
                num=num/10;
            }

        }
        return arr;
    }

    public static String duck(int[] num){
        int sum=0;
        String d;
        for(int number:num){
            if(number!=0){
                sum++;
            }
        }
        if(sum==num.length-1){
            d="Duck Number";
        }
        else{
            d="Not a Duck Number";
        }
        return d;
    }
    public static void armstrong(int[] arr){
        int temp=0;
        int digits=0;
        int sum=0;
        int num=0;
        for(int number:arr){
            digits++;
        }
        for(int number:arr){
            double p=Math.pow(number,digits);
            sum+=p;

        }
        for(int i=arr.length-1;i>=0;i--){
            num=num*10;
            num+=arr[i];
        }
        if(sum==num){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }

    }
    public static void min(int[] num){
        int min=num[0];
        int min1=num[0];
        for(int i=0;i<num.length-1;i++){
            if(num[i]<min){
                min=num[i];
            }
        }

        for(int i=0;i<num.length-1;i++){
            if(num[i]<min1&&min>min1){
                min1=num[i];
            }
        }
        System.out.println(min);
        System.out.println(min1);

    }
    public static void max(int[] num){
        int max=num[0];
        int max1=num[0];
        for(int i=0;i<num.length-1;i++){
            if(num[i]>max){
                max=num[i];
            }
        }

        for(int i=0;i<num.length-1;i++){
            if(num[i]>max1&&max<max1){
                max1=num[i];
            }
        }
        System.out.println(max);
        System.out.println(max1);

    }

    static void main(String[] args) {
        int num=153;
        int nums[]=array(num);
        System.out.println(count(num));

        System.out.println(duck(nums));
        armstrong(nums);
        min(nums);
        max(nums);

    }

}
