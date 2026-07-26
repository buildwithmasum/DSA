class Solution {
    public int maxDepth(String s) {
       
        int maxdepth=0;
        int count=0;
        char[] arr=s.toCharArray();
       for(int i=0;i<arr.length;i++){
        if(arr[i]=='('){
            count++;
            maxdepth=Math.max(count,maxdepth);
        }
       if(arr[i]==')'){
           count--;
           
        }
       }

    return maxdepth;
    }
}
