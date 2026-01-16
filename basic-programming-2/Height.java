import java.util.Scanner;

class Height{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter height ");
		int h=sc.nextInt();
		double i=h*2.54f;
		double f=i*12;
		
		System.out.println("height in inches "+i);
		System.out.println("height in feet "+f);
	}
}