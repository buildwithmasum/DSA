class Solution {
    public boolean isPossible(int[] bloomDay,int day,int m,int k){
        int count=0;
        int bouquets=0;
     for(int bloom:bloomDay ){
        if(bloom<=day){
            count++;
            if(count==k){
                bouquets++;
                count=0;
            }
        }
        else{
            count=0;
        }
     }
     return bouquets>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long totalflower=(long) m*k;
        if(totalflower>bloomDay.length){
            return -1;
        }
         int min = bloomDay[0], max = bloomDay[0];
    for (int b : bloomDay) {
        min = Math.min(min, b);
        max = Math.max(max, b);
    }
    int res=-1;
       while(min<=max){
        int mid=min+(max-min)/2;

        if(isPossible(bloomDay,mid,m,k)){
           res=mid;
           max=mid-1;
        }
        else {
            min=mid+1;
        }

       }
        return res;
    }
}