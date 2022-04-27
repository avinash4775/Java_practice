import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    int r1,c1,r2,c2,i,j,k,sum=0;
	    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows in matrix 1:");
		r1=sc.nextInt();
			System.out.println("Enter the number of column in matrix 1:");
		c1=sc.nextInt();
		int [][]a=new int[r1][c1];
	
			System.out.println("Enter the element in matrix 1:");
			for(i=0;i<r1;i++)
			{
			    for(j=0;j<c1;j++)
			    	a[i][j]=sc.nextInt();
			}
			
			System.out.println("Enter the number of rows in matrix 2:");
		r2=sc.nextInt();
			System.out.println("Enter the number of column in matrix 2:");
		c2=sc.nextInt();
		
			if(c1!=r2)
			{
			    System.out.println("multiplication not possible no. of column in matrix1 not equal to number of row in matrix2");
			    return;
			}
		
				int [][]b=new int[r2][c2];
				System.out.println("Enter the element in matrix 2:");
			for(i=0;i<r2;i++)
			{
			    for(j=0;j<c2;j++)
			    	b[i][j]=sc.nextInt();
			}
			
		
			int [][]res=new int[r1][c2];
			
	
	for(i=0;i<r1;i++)
	{   
	    for(j=0;j<c2;j++)
	    { sum=0;
	        for(k=0;k<c1;k++)
	        {
	          sum =sum+a[i][k]*b[k][j];
	        }
	         res[i][j]=sum;
	    }
	   
	}
	
		for(i=0;i<r1;i++)
			{
			    for(j=0;j<c2;j++)
			    System.out.println(res[i][j]);	
			}
		
	}
}
