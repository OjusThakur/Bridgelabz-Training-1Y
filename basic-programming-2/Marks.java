import java.util.Scanner;

class Marks{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks in maths ");
		int m=sc.nextInt();
		System.out.println("Enter marks in physics ");
		int p=sc.nextInt();
		System.out.println("Enter marks in Chemistry ");
		int c=sc.nextInt();
		int average=(m+p+c)/3;
		System.out.println("Average marks are ");
		System.out.println(average);
	}
}