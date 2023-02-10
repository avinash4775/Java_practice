import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int []arr=new int[]{1,4,4,5,5,5,6,6,11};
		int i=0,j=arr.length-1;
		int count=0;
		int k=10;
		int count_left=0;
		int count_right=0;
		while(i<=j){
		    count_left=0;
	        count_right=0;
	        int x=arr[i];
	        int y=arr[j];
		    if(arr[i]!=arr[j] &&(arr[i]+arr[j]==k)){
		        while(arr[i]==x){
		            count_left++;
		            i++;
		        }
		         while(arr[j]==y){
		            count_right++;
		            j--;
		        }
		        count=count+(count_right*count_left);
		        
		    }
		    else if(arr[i]==arr[j] &&(arr[i]+arr[j]==k)){
		        count+=fact(j-i+1)/(fact(j-i-1) *2);
		        break;
		    }
		    else if(arr[i]+arr[j]<k){
		        i++;
		    }
		    else{
		        j--;
		    }
		}
		System.out.println(count);
	}
	public static int fact(int n){
	    int fac=1;
	    for(int i=1;i<=n;i++){
	        fac=fac*i;
	    }
	    return fac;
	}
}
