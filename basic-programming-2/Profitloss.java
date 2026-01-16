import java.util.Scanner;

class Profitloss{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter cost price ");
		int cp=sc.nextInt();
		System.out.println("Enter selling price ");
		int sp=sc.nextInt();
		int profit=sp-cp;
		int prp=(profit/cp)*100;
		System.out.println("Profit is "+profit);
		System.out.println("Profit percentage "+prp);
	}
}