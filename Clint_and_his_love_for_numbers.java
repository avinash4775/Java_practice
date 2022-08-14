/******************************************************************************
Clint loves numbers so much, that he tries to find some quirky math tricks whenever he can One day,
he decides to take up a number and tries to find out in how many minimum numbers of steps, can he
reduce that number to 0. The steps he performs were
1. Either decrease the number by 1, or
2. Replace the number by its largest prime divisor (note that divisor cannot be 1 and number itself).
Help Clint find the minimum number of steps to reduce the given norber to 0
Input Specification
input1: The number N
Output Specification
Return the minimum number of steps to reduce the number to 0.
Example 1
input1:9
Output: 4
Explanation:
Here, 9 can be reduced to 0 as
1 Replace it by its largest prime divisorie 3
2 Reduce 3 to 2


*******************************************************************************/
import java.util.*;
public class Main
{
		static int maxPrimeFactors(int n)
    {
        
        int maxPrime = -1;
 
        while (n % 2 == 0) {
            maxPrime = 2;
 
           
            n >>= 1;
        }
        while (n % 3 == 0) {
            maxPrime = 3;
            n = n / 3;
        }
 
        
        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            while (n % i == 0) {
                maxPrime = i;
                n = n / i;
            }
            while (n % (i + 2) == 0) {
                maxPrime = i + 2;
                n = n / (i + 2);
            }
        }
 
        
        if (n > 4)
            maxPrime = n;
 
        return maxPrime;
    }
    static boolean isPrime(int n)
    {
 
        
        if (n <= 1)
            return false;
 
        else if (n == 2)
            return true;
 
        
        else if (n % 2 == 0)
            return false;
 
       
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args)
    {
        int  n = 11;
        int count=0;
        if(n<4){
            System.out.println(n);
        }
       
        else{
             while(n>0){
             
             if(n==2){
                 count=count+2;
                 break;
             }
             count++;
             
             if(isPrime(n)){
            n--;
             }
             else{
                 n=maxPrimeFactors(n);
             }
         }
         System.out.println(count);
        
        } 
        
          
      
 
    }
}
