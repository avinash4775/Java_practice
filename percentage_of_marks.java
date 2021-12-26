import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the maximum  marks of each subject");
	 byte  total= sc.nextByte();
		System.out.println("Enter the marks of Maths");
		byte  maths=sc.nextByte();
			System.out.println("Enter the marks of sst");
		byte sst=sc.nextByte();
			System.out.println("Enter the marks of hindi");
		byte hindi=sc.nextByte();
			System.out.println("Enter the marks of english");
		byte english=sc.nextByte();
			System.out.println("Enter the marks of science");
		byte science=sc.nextByte();
		
		
		float per= (maths+sst+hindi+english+science)*100/(5*total);
		
		System.out.println(per+"% ");
	}
}
