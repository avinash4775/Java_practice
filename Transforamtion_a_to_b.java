// Vasily has a number a, which he wants to turn into a number b. For this purpose, he can do two types of operations:

// multiply the current number by 2 (that is, replace the number x by 2·x);
// append the digit 1 to the right of current number (that is, replace the number x by 10·x + 1).
// You need to help Vasily to transform the number a into the number b using only the operations described above, or find that it is impossible.

// Note that in this task you are not required to minimize the number of operations. It suffices to find any way to transform a into b.

// Input
// The first line contains two positive integers a and b (1 ≤ a < b ≤ 109) — the number which Vasily has and the number he wants to have.

// Output
// If there is no way to get b from a, print "NO" (without quotes).

// Otherwise print three lines. On the first line print "YES" (without quotes). The second line should contain single integer k — the length of the transformation sequence. On the third line print the sequence of transformations x1, x2, ..., xk, where:

// x1 should be equal to a,
// xk should be equal to b,
// xi should be obtained from xi - 1 using any of two described operations (1 < i ≤ k).
// If there are multiple answers, print any of them

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
			ArrayList <Integer> ans=new ArrayList<Integer>();
		boolean flag=value(a,b,ans);
		
	
		if(flag){
		    System.out.println("YES");
		   System.out.println(ans.size());
		  for(int  i=ans.size()-1;i>=0;i--)
		System.out.print(ans.get(i)+" ");   
		}
		else
		System.out.println("NO");
		
		
		
	}

	public static boolean value(int a,int b,ArrayList<Integer> ans){
	    if(a==b){
	        ans.add(a);
	        return true;
	    }
	    
	    else if(a>b)
	    return false;
	    
	    
	    ans.add(b);
	    if(b%2==0)
	    return value(a,b/2,ans);
	    else if(b%10==1)
	    return value(a,b/10,ans);
	   
	  
	    return false;
	}
}
