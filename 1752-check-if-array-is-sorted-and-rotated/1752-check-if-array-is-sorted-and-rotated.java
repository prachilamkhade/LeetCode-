class Solution {
    public boolean check(int[] nums) {
        
        if(checkif(nums,0)){
            return true;
        }
        return rotate(nums,0);
    }

    public boolean checkif(int[] nums,int i){

        if(i>=nums.length-1){
           return true; 
        }

       if(nums[i]>nums[i+1]){
        return false;
       }

        return checkif(nums,i+1);
    }

    public boolean rotate(int[] nums,int rotate){
        
        if(rotate>=nums.length-1){
            return false;
        }

        int temp=nums[0];
        leftShift(nums,0);
        nums[nums.length-1]=temp;


        if (checkif(nums, 0)) {
            return true;
        }

        return rotate(nums,rotate+1);

    }


    public void leftShift(int[] nums,int i){
        if(i>=nums.length-1){
            return;
        }

        nums[i]=nums[i+1];

        leftShift(nums,i+1);
    }

}