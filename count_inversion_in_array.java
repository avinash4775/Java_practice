import java.util.*;
public class Main
{   public static int count=0;
    public static ArrayList<Integer>temp=new ArrayList();
	public static void main(String[] args) {
		int []arr=new int[]{5,1,2,3,0,4};
		merge_sort(arr,0,5);
		System.out.println(count);
		
	}
	public static void merge_sort(int []arr,int l,int h){
	    if(l==h)
	    return;
	    int mid=(l+h)/2;
	    merge_sort(arr,l,mid);
	    merge_sort(arr,mid+1,h);
	    merge(arr,l,mid,mid+1,h);
	}
	public static void merge(int []arr,int s1,int e1,int s2,int e2){
	    int i=s1,j=s2;
	    while(i<=e1&&j<=e2){
	        if(arr[i]<=arr[j]){
	            temp.add(arr[i]);
	            i++;
	        }
	        else{
	            temp.add(arr[j]);
	            count+=((e1-i)+1);
	            j++;
	        }
	    }
	    while(i<=e1){
	        temp.add(arr[i]);
	        i++;
	    }
	    while(j<=e2){
	        temp.add(arr[j]);
	        j++;
	    }
	    
	    for(i=s1;i<=e2;i++){
	        arr[i]=temp.get(i-s1);
	    }
	    temp.clear();
	}
}
