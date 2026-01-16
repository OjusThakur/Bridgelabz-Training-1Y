import java.util.Scanner;
class Fahrenheit{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int celsius= sc.nextInt();
		int fahrenheit=(celsius*9/8)+32;
		System.out.println(fahrenheit);
}}