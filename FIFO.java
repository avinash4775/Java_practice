//Page replacement using FIFO

import java.util.*;
public class Main{
    public static void main(String [] arg){
        Scanner sc=new Scanner (System.in);
        int num=0,buff_size=0,page_fault=0,i=0,j=0,buff_index=0;
        boolean flag=false;
        System.out.println("Enter the number of requested pages:");
        num=sc.nextInt();
        int [] pages=new int [num];
        System.out.println("Enter the page no. requested:");
        for(i=0;i<num;i++)
        pages[i]=sc.nextInt();
        
        
         System.out.println("Enter the size of buffer:");
        buff_size=sc.nextInt();
        int [] buffer=new int [buff_size];
        
        for(i=0;i<num;i++)
        { flag=false;
            for(j=0;j<buff_size;j++)
            {
                if(pages[i]==buffer[j])
                {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                buffer[buff_index++]=pages[i];
                page_fault++;
                buff_index=buff_index%buff_size;
            }
        }
        System.out.println("page_fault "+page_fault);
        System.out.println("pages left in buffer:");
        for(i=0;i<buff_size;i++)
        {
            System.out.println(buffer[i]);
        }
    }
}
