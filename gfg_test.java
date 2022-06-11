//if any character repeat in the string then remove character occurance at begining and reverse the string and perform until all  character 
//    is single in occurence .
//    ex- abab
//    output -ba
//    explain - remove 'a' then 'bab' reverse 'bab' then remove 'b' that is beginning 'ab' and then reverse 'ab' we get 'ba'

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String S="";
		System.out.println("Enter the string");
		S=sc.nextLine();
		StringBuilder sb =new StringBuilder();
		StringBuilder temp =new StringBuilder();
		HashSet<Character> hs=new HashSet<>();
		sb.append(S);
		int i=0;
		for(i=0;i<sb.length();i++)
		{
		  if(! hs.add(sb.charAt(i))) 
		     temp.append(sb.charAt(i));
		}
		for(i=0;i<sb.length();i++)
		{
		    if(sb.charAt(i)==temp.charAt(0))
		    {
		        sb.deleteCharAt(i);
		        sb.reverse();
		        temp.deleteCharAt(0);
		        i=-1;
		    }
		    if(temp.length()==0)
		    {
		        System.out.println(sb);
		        return;
		    }
		}
		
	}
}
