import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int []a=new int[n];
	    int []b=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	     for(int i=0;i<n;i++){
	        b[i]=sc.nextInt();
	    }
	    int ans=0;
	    int count0=0;
	    HashMap<Double,Integer> hm=new HashMap();
	    for(int i=0;i<n;i++){
	        double temp=0;
	       // if((a[i]<0 && b[i]<0)||a[i]>0&&b[i]>0){
	       //     temp=((-1 *)b[i])/(a[i]);
	       // }
	       // else if((a[i]<0 && b[i]>0)||(a[i]>0&&b[i]<0))
	       // temp=(b[i])/(a[i]);
	        if(a[i]==0 && b[i]==0){
	            count0 ++;
	        }
	        else if(a[i]!=0){
	            temp=(double)(-1 *b[i])/(double)(a[i]);
	            if(hm.containsKey(temp)){
	            hm.put(temp,hm.get(temp)+1);
	            ans=Math.max(ans,hm.get(temp));
	        }
	        else{
	            hm.put(temp,1);
	            ans=Math.max(ans,hm.get(temp));
	        }
	        }
	        
	        
	    }
	   
	    
		System.out.println(ans+count0);
	}
}
