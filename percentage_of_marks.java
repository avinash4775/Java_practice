import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        	System.out.println("Enter the maximum  marks of each subject");
	 float  total= sc.nextByte();
		System.out.println("Enter the marks of Maths");
		 float   maths=sc.nextByte();
			System.out.println("Enter the marks of sst");
		 float  sst=sc.nextByte();
			System.out.println("Enter the marks of hindi");
		 float  hindi=sc.nextByte();
			System.out.println("Enter the marks of english");
		 float  english=sc.nextByte();
			System.out.println("Enter the marks of science");
		 float  science=sc.nextByte();
		
		
		float per= (maths+sst+hindi+english+science)*100/(5*total);
		
		System.out.println(per+"% ");
	}
}
