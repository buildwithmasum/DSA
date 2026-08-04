class Solution {
    public int maxSubArray(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
    int ansstart=-1;
    int ansend=-1;
    int sum=0;
    int start=0;

        for(int i=0;i<n;i++){
            
            if(sum==0){ start=i;}
            sum=sum+nums[i];
            if(sum>maxi){
                maxi=sum;
                ansstart=start; ansend=i;

            }
            if(sum<0){
                sum=0;
            }
        }

        for(int i=ansstart;i<=ansend;i++){
            System.out.println(nums[i]);
        }

        return maxi;
    }
}