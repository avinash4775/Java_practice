// Return the pattern of sizeM x N with specifications:

// The pattern should have ‘DEVSNEST!’ written in the center.
// The pattern should only use |, . and - characters
// Note: M is an odd natural number, and N is 3 times M

// Input Format
// First Parameter - Integer M

// Second Parameter - Integer N

// Output Format
// Return the array of string

// Example 1
// Input: 
//     9
//     27
// Output:
//     ------------.|.------------
//     ---------.|..|..|.---------
//     ------.|..|..|..|..|.------
//     ---.|..|..|..|..|..|..|.---
//     ---------DEVSNEST!---------
//     ---.|..|..|..|..|..|..|.---
//     ------.|..|..|..|..|.------
//     ---------.|..|..|.---------
//     ------------.|.------------
// Constraints
// 5 < M < 101
// 15 < N < 303
// M is an odd natural number, and N is 3 times M.



static String[] solve(int M, int N){
//CODE HERE 
String []res=new String[M];
int i=0,j=0,k=0,l=0;
String str1=".|.";
String str2="";
for(i=0;i<M/2;i++)
{   str2="";
    for(j=1;j<=(((N-3)/2)-3*i);j++)
    {
        str2=str2+"-";
    }
    for(k=0;k<i;k++)
    {
        str2=str2+str1;
    }
    StringBuilder sb=new StringBuilder(str2);
    sb.reverse();
    str2=str2+str1+sb.toString();
    res[l++]=str2;
}
String str3="DEVSNEST!";
for(i=0;i<(N-9)/2;i++)
str3="-"+str3+"-";
  res[l++]=str3;
  for(i=M/2-1;i>=0;i--)
  {
    str2="";
    for(j=1;j<=(((N-3)/2)-3*i);j++)
    {
        str2=str2+"-";
    }
    for(k=0;k<i;k++)
    {
        str2=str2+str1;
    }
    StringBuilder sb1 =new StringBuilder(str2);
    sb1.reverse();
    str2=str2+str1+sb1.toString();
    res[l++]=str2;
  }
  return res;
}
