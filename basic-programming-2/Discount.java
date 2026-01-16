import java.util.Scanner;

class Discount{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Student fee");
		int stf=sc.nextInt();
		System.out.println("Enter discount perecntage ");
		float d=sc.nextInt();
		float da=(d/100f)*stf;
		double dp=stf-da;
		
		System.out.println("discountrd amount is "+da);
		System.out.println("discounted price is "+dp);
	}
}