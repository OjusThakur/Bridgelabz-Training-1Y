import java.util.Scanner;

class Price{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Unit Price ");
		int up=sc.nextInt();
		System.out.println("Enter Quantity ");
		int q=sc.nextInt();
		double tp=up*q;
		System.out.println("Total Price is "+tp);
	}
}