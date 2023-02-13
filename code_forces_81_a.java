import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    int n=str.length();
	    StringBuilder st=new StringBuilder();
	   Stack <Character>st1=new Stack();
	   for(int i=0;i<n;i++){
	       
	       if(!st1.isEmpty() && st1.peek()==str.charAt(i)){
	           st1.pop();
	           
	       }
	       else{
	           st1.push(str.charAt(i));
	       }
	   }
	   Stack <Character>st2=new Stack();
	   while(!st1.isEmpty()){
	       char c=st1.pop();
	       st2.push(c);
	   }
	   while(!st2.isEmpty()){
	       st.append(st2.pop());
	   }
	   
		System.out.println(st);
	}
}
