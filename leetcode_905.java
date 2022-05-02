//Sort array By parity starting with even number and ending with odd

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0,j=nums.length-1,temp=0;
        if(nums.length==1)
            return nums;
        while(i<=j)
        {
           if(nums[j]%2==0)
           {
               if(nums[i]%2!=0)
               {
                temp=nums[j];
                   nums[j]=nums[i];
                   nums[i]=temp;
                   i++;
               j--;
               }
               else 
               {
                i++;
               }
           }
            else if(nums[j]%2!=0)
                j--;
            else if(nums[i]%2==0)
                i++;
        }
        return nums;
        
    }
}
