class Solution {
    public  boolean isPossible(int[] nums,int divisor,int threshold){
       double sum=0;
        for(int n: nums){
            sum+=Math.ceil((double) n/divisor);
        }

        return sum<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int min = 1, max = nums[0];
        for (int b : nums) {
            max = Math.max(max, b);
        }
        int ans=max;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(isPossible(nums,mid,threshold)){
                max=mid-1;
                ans=mid;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
}