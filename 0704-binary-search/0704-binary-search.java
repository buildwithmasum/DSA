class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        return binarysearch(nums,target,0,nums.length-1);
       
    }
    public int binarysearch(int[] nums,int target,int st,int lt){
        while(st<=lt){
            int mid=st+(lt-st)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                    st=mid+1;
                }
            else if(target<nums[mid]){
                lt=mid-1;
            }
        }
        return -1;
        
    }
}