class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        char[] arr=s.toCharArray();
       for(int i=0;i<arr.length;i++){
        if(arr[i]=='('){
            if(count>0){
                sb.append('(');
            }
            count++;
        }
       if(arr[i]==')'){
           count--;
            if(count>0){
                sb.append(')');
            }
           
        }
       }

    return sb.toString();
    }
}