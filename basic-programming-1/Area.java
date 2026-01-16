import java.util.Scanner;

class Area{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius ");
		int r=sc.nextInt();
		System.out.println("Enter value of pi ");
		float pi=sc.nextFloat();
		float area=r*r*pi;
		System.out.println(area);
	}
}