/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        int []arr=new int[n+1];
	        for(int i=1;i<=n;i++)
	        arr[i]=sc.nextInt();
	        int[]dp=new int[n+1];
	        dp[0]=1;
	        for(int i=1;i<=n;i++){
	            if((i-arr[i]-1 )>=0 && dp[i-arr[i]-1]==1){
	                dp[i]=1;
	            }
	            if((i+arr[i])<=n && dp[i-1]==1)
	            dp[i+arr[i]]=1;
	        }
	        if(dp[n]==1)
		System.out.println("YES");
		else
		System.out.println("NO");
	    }
	    
	}
}
