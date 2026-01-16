import java.util.Scanner;

class Handshake{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("No. of students ");
		int st=sc.nextInt();
		double h=(st*(st-1))/2;
		System.out.println("Maximum Number Of Handshakes are "+h);
	}
}