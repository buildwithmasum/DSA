class Solution {
    public int searchInsert(int[] nums, int target) {
        int high=nums.length-1;
       int low=0;
       boolean found=false;
       while(low<=high)
    {
        int mid=low+(high-low)/2;

        if(nums[mid]==target){
            found=true;
            return mid;
        }
        else if(nums[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
     if (found==false){
        return high+1;
     }        
    return -1;
    }
}
