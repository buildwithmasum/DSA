class Solution {
    public int maxDepth(String s) {
        if(!s.contains("(")){
            return 0;
        }
        int min=Integer.MIN_VALUE;
        int count=0;
        char[] arr=s.toCharArray();
       for(int i=0;i<arr.length;i++){
        if(arr[i]=='('){
            count++;
            min=Math.max(count,min);
        }
       if(arr[i]==')'){
           count--;
           
        }
       }

    return min;
    }
}
