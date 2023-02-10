import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int []arr=new int[]{1,3,9,11,22,30};
		int i=0,j=1;
	int k=50;
	boolean flag=true;
	while(j<arr.length){
	    if(i==j)
	     j++;
	    else if(arr[j]-arr[i]==k){
	        System.out.println(true);
	        flag=false;
	        break;
	    }
	    else if(arr[j]-arr[i]<k)
	     j++;
	     else
	     i++;
	}
	if(flag)
	 System.out.println(false);
	}
	
}
