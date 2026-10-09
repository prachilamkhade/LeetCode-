1class Solution {
2    public void reverseString(char[] s) {
3        
4        int n=s.length;
5        //char temp;
6        for(int i=0;i<n/2;i++){
7            char temp=s[i];
8            s[i]=s[n-1-i];
9            s[n-1-i]=temp;
10        }
11    }
12}