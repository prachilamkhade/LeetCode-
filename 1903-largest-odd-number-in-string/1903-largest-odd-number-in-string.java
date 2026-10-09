class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();

        String str="";
        
        for(int i=n-1;i>=0;i--){
            int digit=num.charAt(i);
            if(digit%2==0){
               // num.subString(0,)
                continue;
            }
            else{
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}