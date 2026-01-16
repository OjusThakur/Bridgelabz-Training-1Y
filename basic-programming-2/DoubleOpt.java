import java.util.Scanner;

class Intoperations{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a ");
		double a=sc.nextInt();
		System.out.println("Enter b ");
		double b=sc.nextInt();
		System.out.println("Enter c ");
		double c=sc.nextInt();
		double ad=a+b*c;
		double s=a*b+c;
		double d=c+a/b;
		double m=a%b+c;
		
		System.out.println("1st Operation is "+ad);
		System.out.println("2nd Operation is "+s);
		
		System.out.println("3rd Operation is "+m);
		
		System.out.println("4th Operation is "+d);
	}
}