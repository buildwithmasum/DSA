class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int k=m+n;
        int [] arr= new int[k];
       int i=0;
       int j=0;
       int index=0;
       while(i<m && j<n){
        if(nums1[i]<nums2[j]){
            arr[index++]=nums1[i++];
        }
        else{
            arr[index++]=nums2[j++];
        }
       }
       while(i<m){
         arr[index++]=nums1[i++];
       }
       while(j<n){
         arr[index++]=nums2[j++];
       }
        double median=0;
        int l=arr.length;
       if(l%2==0){
        median=(double)(arr[l/2]+arr[(l/2)-1])/2.0;
        return median;
       }
       else{
         median=arr[l/2];
         return median;
       }
    }
}