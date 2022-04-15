/******************************************************************************

Enter the string in the format AAAAABBBBCCCCDDD 
output is A5B4C4D3

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		int i=0,count=0,j;
		char t;
		String res="";
		for(i=0;i<str1.length();i++)
		{
		    t=str1.charAt(i);
		    count=1;
		    j=i;
		    while(j<str1.length()-1)
		    {
		        if(str1.charAt(j)==str1.charAt(j+1))
		        {
		            count++;
		            j++;
		        }
		        else
		            break;
		    }
		    res=res+t+Integer.toString(count);
		    i=j;
		    
		}
		System.out.println(res);
		
	}
}
