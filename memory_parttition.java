import java.util.*;
public class Main
{
    //function for firstFit
    
    static void firstFit(int no_process,int no_freeslot,int[]free_slot,int[]process_req){
        int i=0,j=0,count=0;
        
        for(i=0;i<no_process;i++)
	     {
	         for(j=0;j<no_freeslot;j++)
	     {
	         if(free_slot[j]>=process_req[i])
	         {
	            free_slot[j]=-1;
	            process_req[i]=-2;
	            break;
	         }
	     }
	         
	     }
	  
	 for(i=0;i<no_process;i++)
	 {
	     if(process_req[i]!=-2)
	     {
	         System.out.println(process_req[i]);
	         count ++;
	     }
	 }
	 if(count>0)
	 System.out.println("Above process are not allocated");
	 if(count==0)
	 System.out.println("All are allocated");
    }
    
    //function for worstFit
    
    static void worstFit(int no_process,int no_freeslot,int[]free_slot,int[]process_req){
		    int i=0,j=0,count=0;
		    Arrays.sort(free_slot);
		for(i=0;i<no_process;i++)
		{
		    for(j=no_freeslot-1;j>=0;j--)
		    {
		        if(process_req[i]<=free_slot[j])
		        {
		            process_req[i]=-1;
		            free_slot[j]=-2;
		            break;
		        }
		    }
		}
		
		System.out.println("------------------------------------------------");
		
		for(i=0;i<no_process;i++)
		{
		    if(process_req[i]!=-1)
		    {
		        System.out.println(process_req[i]);
		        count++;
		    }
		      
		}
		if(count==0)
		System.out.println("Memory is allocated to all the process");
		else
		System.out.println("Memory is not allocated to above process");
		    
		}
		
	//	function for bestFit
		
		
		static void bestFit(int no_process,int no_freeslot,int[]free_slot,int[]process_req){
		    int i=0,j=0,count=0;
		    Arrays.sort(free_slot);
		for(i=0;i<no_process;i++)
		{
		    for(j=0;j<no_freeslot;j++)
		    {
		        if(process_req[i]<=free_slot[j])
		        {
		            process_req[i]=-1;
		            free_slot[j]=-2;
		            break;
		        }
		    }
		}
		
		System.out.println("------------------------------------------------");
		
		for(i=0;i<no_process;i++)
		{
		    if(process_req[i]!=-1)
		    {
		        System.out.println(process_req[i]);
		        count++;
		    }
		      
		}
		if(count==0)
		System.out.println("Memory is allocated to all the process");
		else
		System.out.println("Memory is not allocated to above process");
		    
		}
		
		//main function or driving function
		
	public static void main(String[] args) {
	    
	    
	    
	    Scanner sc=new Scanner (System.in);
	    int no_freeslot=0,no_process=0,i=0,j=0,count=0,choice=0;
		System.out.println("Enter the number of process: ");
		no_process=sc.nextInt();
		int []process_req=new int[no_process];
		System.out.println("Enter the requirement of each process: ");
		for(i=0;i<no_process;i++)
		process_req[i]=sc.nextInt();
		
		System.out.println("Enter the number of free slot: ");
		no_freeslot=sc.nextInt();
		int []free_slot=new int[no_freeslot];
		System.out.println("Enter the memory  of each slot: ");
		for(i=0;i<no_freeslot;i++)
		free_slot[i]=sc.nextInt();
		
		
		System.out.println("Enter choice : \n 1.First Fit \n 2.Best Fit \n 3.Worst Fit  ");
		
		choice =sc.nextInt();
		if(choice==1)
		{
		    firstFit( no_process,no_freeslot,free_slot,process_req);
		}
	 else	if(choice==2)
		{
		    bestFit(no_process, no_freeslot,free_slot,process_req);
		}
	else if(choice==3)
		{
		    worstFit(no_process,no_freeslot,free_slot,process_req);
		}
		else {
		    System.out.println("Wrong Choice !");
		}
	}
}
