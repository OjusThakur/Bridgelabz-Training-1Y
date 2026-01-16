import java.util.Scanner;

class Triangle{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Base ");
		int b=sc.nextInt();
		System.out.println("Enter Height ");
		int h=sc.nextInt();
		double a=(1.0/2.0)*b*h;
		double i=a*2.54f;
		System.out.println("Area of triangle is centimeters "+a);
		
		System.out.println("Area of triangle in inches "+i);
	}
}