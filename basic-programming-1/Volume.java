import java.util.Scanner;
class Volume{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius ");
		int r=sc.nextInt();
		System.out.println("Enter height");
		int h= sc.nextInt();
		float pi= 3.14f;
		float volume=pi*r*r*h;
		System.out.println(volume);
	}
}