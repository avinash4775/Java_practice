public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int i=0,count=0;
       String str1=Integer.toBinaryString(n);
        for(i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)=='1')
                count++;
        }
        return count;
    }
}
