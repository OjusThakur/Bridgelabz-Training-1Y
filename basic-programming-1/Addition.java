import java.util.Scanner;

class Userinput{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a= sc.nextInt();
		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();
		int add=a+b;
		System.out.println(add);
	}
}