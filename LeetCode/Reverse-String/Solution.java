1class Solution {
2    public void reverseString(char[] s) {
3        //2,3,4,5,6,7==n/2=3..
4        int n=s.length;
5        for(int i=0;i<n/2;i++){
6
7            
8            char temp=s[i];
9            s[i]=s[n-1-i];
10            s[n-1-i]=temp;
11        }
12    }
13}