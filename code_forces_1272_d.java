import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n<2)
	    System.out.println(n);
	    else
	    {
	        int []arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int []prefix=new int[n];
	    prefix[0]=1;
	    int []suffix=new int[n];
	    suffix[n-1]=1;
	    int ans=1;
	    for(int i=1,j=n-2;i<n&&j>=0;i++,j--){
	        if(arr[i-1]<arr[i]) 
	        prefix[i]=prefix[i-1]+1;
	        else
	        prefix[i]=1;
	        
	        if(arr[j]<arr[j+1]){
	            suffix[j]=suffix[j+1]+1;
	        }
	        else
	        suffix[j]=1;
	    }
	    
	    for(int i=1;i<n-1;i++){
	       
	            ans=Math.max(ans,prefix[i]);
	        if(arr[i-1]<arr[i+1]) {
	            ans=Math.max(ans,prefix[i-1]+suffix[i+1]);
	        }
	        		
	    }
	    ans=Math.max(ans,prefix[n-1]);
	    
		System.out.println(ans);
	    }
	    
	}
}
