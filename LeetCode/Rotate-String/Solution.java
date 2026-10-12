1class Solution {
2    public boolean rotateString(String s, String goal) {
3        
4        int n=s.length();
5        
6
7            
8            
9            if(s.length()!=goal.length()){
10                return false;
11            }
12
13            String x=s+s;
14            
15            if(x.contains(goal)){
16                return true;
17            }
18
19        
20        return false;
21    }
22}