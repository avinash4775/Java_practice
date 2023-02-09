import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int [][]arr=new int[n][2];
		for(int i=0;i<n;i++){
		    arr[i][0]=sc.nextInt();
		    arr[i][1]=sc.nextInt();
		}
		if(n==0)
		System.out.println(0);
		
		else {
		    Arrays.sort(arr,(a,b)->a[0]-b[0]);
		long ans=arr[0][1];
		long sum=arr[0][1];
		int index=0;
		for(int i=1;i<n;i++){
		    if(Math.abs(arr[index][0]-arr[i][0])<d){
		        sum=sum+arr[i][1];
		        ans=Math.max(ans,sum);
		    }
		    else{
		        sum=sum-arr[index][1];
		        index++;
		        i--;
		        ans=Math.max(sum,ans);
		    }
		}
		System.out.println(ans);
		}
	}
}
