import java.util.Scanner;

class Volume{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		float pi=3.14f;
		System.out.println("Radius of earth ");
		int r=sc.nextInt();
		double v=(4/3)*pi*r*r*r;
		double miles=v*1.6f;
		
		System.out.println("volume in km "+v);
		System.out.println("Volume in miles "+miles);
	}
}