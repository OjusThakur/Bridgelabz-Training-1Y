import java.util.Scanner;
class Kmtomiles{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter kilometers ");
		int km=sc.nextInt();
		float mile=km*0.621371f;
		System.out.println(mile);
	}
}