import java.util.Scanner;
class Perimeter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length ");
		int l=sc.nextInt();
		System.out.println("Enter Breadth ");
		int b=sc.nextInt();
		int peri=2*(l+b);
		System.out.println(peri);
	}
}