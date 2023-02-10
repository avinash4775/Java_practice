// print_k_numbers_that_has_only_factor_n1_n2_and_n3
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int k=10,n1=2,n2=3,n3=5;
	    
		int []arr=new int [k];
		arr[0]=1;
		int p2=0,p3=0,p5=0;
		for(int i=1;i<k;i++){
		    int a=arr[p2]*2;
		    int b=arr[p3]*3;
		    int c=arr[p5]*5;
		    int min=Math.min(a,Math.min(b,c));
		    if(arr[i-1]==a){
		        p2++;
		        i--;
		    }
		    
		    else if (arr[i-1]==b)
		    {
		        p3++;
		        i--;
		    }
		    else if(arr[i-1]==c){
		        p5++;
		        i--;
		    }
		    
		    
		    else if(min==a && min!=b && min!=c){
		        arr[i]=a;
		        p2++;
		    }
		    else if(min!=a && min==b && min!=c ){
		        arr[i]=b;
		        p3++;
		    }
		    else if(min!=a && min!=b && min==c ){
		        arr[i]=c;
		        p5++;
		    }
		    else if(min==a && min==b && min!=c)
		    {
		        arr[i]=a;
		        p2++;
		    }
		    else{
		        arr[i]=c;
		        p5++;
		    }
		    
		
	}
	for(int i=0;i<k;i++){
	    System.out.print(arr[i]+" ");
	}
}
}

