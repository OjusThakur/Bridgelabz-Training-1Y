import java.util.Scanner;
class Simpleinterest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal");
		int p=sc.nextInt();
		System.out.println("Enter rate ");
		int r=sc.nextInt();
		System.out.println("Enter time ");
		int t=sc.nextInt();
		int si=(p*r*t)/100;
		System.out.println(si);
	}
}