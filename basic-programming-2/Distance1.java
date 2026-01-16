import java.util.Scanner;

class Distance1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Distance ");
		int d=sc.nextInt();
		float y=d*3;
		float m=y*1760;
		
		
		System.out.println("Distance in km "+y);
		System.out.println("Distance in miles "+m);
	}
}