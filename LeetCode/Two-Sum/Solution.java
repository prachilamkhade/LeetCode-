1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3       for(int i=0;i<nums.length-1;i++){
4
5        for(int j=1;j<nums.length;j++){
6            if(i==j){
7                continue;
8            }
9            if(nums[j]==target-nums[i]){
10                return new int[]{i,j};
11            }
12        }
13        
14       }
15       return new int[]{-1,-1}; 
16
17
18    }
19}
20
21
22        