import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
			System.out.println("Enter your name");
			String name=scan.nextLine();
		   System.out.println("Enter your age");
		   byte age=scan.nextByte();
			System.out.println("Hello "+name+" ,you are "+age+" year old");
	}
}
