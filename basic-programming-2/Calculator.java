import java.util.Scanner;

class Calculator{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a ");
		float a=sc.nextInt();
		System.out.println("Enter b ");
		float b=sc.nextInt();
		double ad=a+b;
		double s=a-b;
		double d=a/b;
		double m=a*b;
		
		System.out.println("Addition is "+ad);
		System.out.println("Subtraction is "+s);
		
		System.out.println("Multiplication is "+m);
		
		System.out.println("Division is "+d);
	}
}