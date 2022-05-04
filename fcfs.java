import java.util.*;
public class Main
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int i,num,min=Integer.MAX_VALUE,sel=-1,j,t=0;
System.out.println("Enter the number of process:");
num=sc.nextInt();
int[]at=new int[num];
System.out.println("Enter the arrival time of processes:");
for(i=0;i<num;i++)
{
   at[i]=sc.nextInt();
}

int[]bt=new int[num];
System.out.println("Enter the burst time of processes:");
for(i=0;i<num;i++)
{
   bt[i]=sc.nextInt();
}
int[]ct=new int[num];
int[]wt=new int[num];
int[]tat=new int[num];
for(i=0;i<num;i++)
{
   for(j=0;j<num;j++)
   {
       if(min>at[j]&&at[j]>-1)
         {
             min=at[j];
             sel=j;
         }
   }
   t=t+bt[sel];
   ct[sel]=t;
   tat[sel]=ct[sel]-at[sel];
   wt[sel]=tat[sel]-bt[sel];
   at[sel]=-1;
}
System.out.println("Ct | tat  |wt");
for(i=0;i<num;i++)
System.out.println(ct[i]+" ,"+tat[i]+" ,"+wt[i]);

}
}
