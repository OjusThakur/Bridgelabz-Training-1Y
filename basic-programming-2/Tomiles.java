import java.util.Scanner;

class Tomiles{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Distance ");
		int d=sc.nextInt();
		double miles=d*1.6f;
		
		System.out.println("Volume in miles "+miles);
	}
}