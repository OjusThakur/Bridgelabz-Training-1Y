import java.util.Scanner;

class Converter{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter kilometer ");
		float km=sc.nextFloat();
		
		float miles=km*1.6f;
		System.out.println("Miles are ");
		System.out.println(miles);
	}
}