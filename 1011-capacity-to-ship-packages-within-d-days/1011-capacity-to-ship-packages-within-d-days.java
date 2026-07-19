class Solution {
    public boolean isPossible(int[] weights,int weight,int days){
        int day=1;
        int load=0;
        for(int w:weights){
            if(load+w>weight){
                day++;
                load=w;
            }
            else{
                load+=w;
            }
        }
        return day<=days;

    }
    public int shipWithinDays(int[] weights, int days) {
        int min=0;int max=0;
        for(int w: weights){
            min=Math.max(min,w);
            max+=w;
        }
        int weightreq=max;
        while(min<=max){
            int mid=min+(max-min)/2;
            if(isPossible(weights,mid,days)){
                weightreq=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }



        }
        return weightreq;
    }
}