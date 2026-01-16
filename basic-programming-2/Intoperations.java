import java.util.Scanner;

class Intoperations{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a ");
		int a=sc.nextInt();
		System.out.println("Enter b ");
		int b=sc.nextInt();
		System.out.println("Enter c ");
		int c=sc.nextInt();
		int ad=a+b*c;
		int s=a*b+c;
		int d=c+a/b;
		int m=a%b+c;
		
		System.out.println("1st Operation is "+ad);
		System.out.println("2nd Operation is "+s);
		
		System.out.println("3rd Operation is "+m);
		
		System.out.println("4th Operation is "+d);
	}
}