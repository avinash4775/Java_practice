// count number of prime digits in number

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int num=755,count=0,k=0;
		while(num>0){
		    k=num%10;
		    if(k==2||k==3||k==5||k==7)
		     count++;
		   num=num/10;
		}
	System.out.println(count);
	}

}
