import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	double tax=0,it;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income ");
	it=sc.nextDouble();
	if(it<=250000)
		tax=0;
	else if(it<=500000)
		tax=0.05*(it-250000);
	else if(it<=750000)
		tax=(0.1*(it-500000))+(0.5*250000);
	else if(it<=1000000)
		tax=(0.15*(it-750000))+(0.1*250000)+(0.1*250000);
		else if(it<=1250000)
		tax=(0.20*(it-1000000))+(0.15*250000)+(0.1*250000)+(0.05*250000);
		else if(it<=1500000)
		tax=(0.25*(it-1250000))+(0.2*250000)+(0.15*250000)+(0.1*250000)+(0.05*250000);
		
	else if(it>1500000)
		tax=(0.3*(it-1500000))+(.25*250000)+(0.2*250000)+(0.15*250000)+(0.1*250000)+(0.05*250000);
		
		if(it>5000000&&it<=10000000){
		    tax=tax+ tax*(.10);
		}
		else if(it<=20000000&&it>10000000){
		    tax=tax+tax*.15;
		}
		else if(it>20000000&&it<=50000000){
		    tax=tax+tax*.25;
		}
		else if(it>50000000){
		    tax=tax+tax*.37;
		}
		tax=tax+tax*(.04);
	System.out.println("Income tax amount is "+tax);
	}
}
