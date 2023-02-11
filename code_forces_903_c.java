import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
         HashMap<Integer,Integer>hm=new HashMap();
	    for(int i=0;i<n;i++){
	        int a=sc.nextInt();
	        if(hm.containsKey(a))
	        {
	            hm.put(a,hm.get(a)+1);
	        }
	        else{
	            hm.put(a,1);
	        }
	    }
	    int max=0;
	    for(Map.Entry<Integer,Integer>en:hm.entrySet()){
	        max=Math.max(en.getValue(),max);
	    }
	    
		System.out.println(max);
	}
}
