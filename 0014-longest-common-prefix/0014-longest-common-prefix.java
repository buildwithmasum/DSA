class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(n==1){
            return strs[0];
        }
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[n-1];
        int i=0;
        while(i<strs[0].length()){
            if(first.charAt(i)!=last.charAt(i)){
                return strs[0].substring(0,i);
            }
            i++;
        }
         return strs[0].substring(0, i);
    }
}