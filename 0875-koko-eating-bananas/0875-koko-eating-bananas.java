class Solution {
    public long findmin(int [] piles,int hour){
        long totalhour=0;
        for(int i=0;i<piles.length;i++){
            totalhour = totalhour + (int) Math.ceil((double) piles[i] / hour);
        }
        return totalhour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int high=piles[piles.length-1];
        int low=1;
        int ans=Integer.MAX_VALUE;
    
        while(low<=high){
            int mid=low+(high-low)/2;
            
            long minhours=findmin(piles,mid);
            if(minhours<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}