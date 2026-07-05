class Solution {
    public boolean check(int[] nums) {
        int checkP = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]) checkP++;
        }
        if(nums[0] < nums[nums.length - 1]) checkP++;
        return checkP <= 1 ? true : false;
    }
}