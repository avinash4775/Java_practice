//Find the first occurence of target  in array .

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int []arr={2,3,5,4,9,4};
	    int target=7;
		System.out.println(arr_find(arr,0,target));
	}
	public static int arr_find(int []arr,int index,int target){
	    
	    if(index==arr.length){
	        return -1;
	    }
	    if(arr[index]==target)
	    return index;
	    else 
	    return arr_find(arr,index+1,target);
	    
	}
}
