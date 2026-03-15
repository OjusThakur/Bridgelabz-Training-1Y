package com.gla.methods.Level_3;

//Create a program to find the shortest, tallest, and mean height of players present in a
//football team.
//Hint =>
//a. The formula to calculate the mean is: mean = sum of all elements/number of elements
//b. Create an int array named heights of size 11 and get 3 digits random height in cms for
//each player in the range 150 cms to 250 cms
//c. Write the method to Find the sum of all the elements present in the array.
//d. Write the method to find the mean height of the players on the football team
//e. Write the method to find the shortest height of the players on the football team
//f. Write the method to find the tallest height of the players on the football team
//g. Finally display the results

public class Height {
    public static int sum(int[] arr){
        int sum=0;
        for(int number:arr){
            sum+=number;
        }
        return sum;

    }
    public static int mean(int[] arr){
        int s=sum(arr);
        int num=arr.length;

        int mean=s/num;
        return mean;
    }
    public static int shorts(int[] arr){
        int min=arr[0];
        for(int number:arr){
            if(number<min){
                min=number;
            }
        }
        return min;
    }
    public static int largre(int[] arr){
        int max=arr[0];
        for(int number:arr){
            if(number>max){
                max=number;
            }
        }
        return max;
    }

    static void main(String[] args) {
        int arr[]={151,170,168,194,177,157,189,169,163,155,155};
        System.out.println("Sum of all elements : "+sum(arr));
        System.out.println("Mean height : "+mean(arr));
        System.out.println("Shortest height : "+shorts(arr));
        System.out.println("Largest height : "+largre(arr));
    }
}
