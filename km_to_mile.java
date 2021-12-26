import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        	System.out.println("Enter your distance:");
        	int km=sc.nextInt();
        	double mile= km*0.621371;
	 
		System.out.println(mile);
	}
}
