import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int i=0,j=0,temp=0;
		int arr[]={12,17,7,18,15,46};
		for(i=0;i<arr.length-1;i++){
		    for(j=0;j<arr.length-i-1;j++){
		        if(arr[j]>arr[j+1]){
		            temp=arr[j];
		            arr[j]=arr[j+1];
		            arr[j+1]=temp;
		        }
		    }
		}
		for(i=0;i<arr.length;i++){
		    System.out.print(arr[i]+",");
		}
	}
}
