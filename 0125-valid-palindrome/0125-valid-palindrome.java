class Solution {
    public boolean isPalindrome(String s) {

    String str=s.replaceAll("[^a-zA-Z0-9]","");
    str=str.toLowerCase();
    int l=0;
    int r=str.length()-1;

     return checkPalin( str, l,r);
        
    }

    

    boolean checkPalin(String str,int l,int r){
        if(l>=r){
            return true;
        }

        if(str.charAt(l)!=str.charAt(r)){
            return false;
        }

        return checkPalin(str, l+1, r-1);
       
    }
}