import java.util.Scanner;

class Student{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no. of pens ");
		int pens=sc.nextInt();
		System.out.println("Enter no. of students ");
		int st=sc.nextInt();
		int que=pens/st;
		int rem=pens%st;
		
		System.out.println("quoteint is "+que);
		System.out.println("remainder is "+rem);
	}
}