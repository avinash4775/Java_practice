//Find maximum element of the array using recursion.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int []arr={2,3,5,6,9,4};
	    
		System.out.println(arr_max(arr,0));
	}
	public static int arr_max(int []arr,int index){
	    
	    if(index==arr.length-1){
	        return arr[index];
	    }
	    return Math.max(arr[index], arr_max(arr,index+1));
	}
}
