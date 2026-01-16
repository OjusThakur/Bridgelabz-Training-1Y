import java.util.Scanner;

class Harry{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter date of year");
		int doy=sc.nextInt();
		System.out.println("Enter current year ");
		int cy=sc.nextInt();
		int age=cy-doy;
		System.out.println(age);
	}
}