class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int []hash=new int[26];

        for(int ch:s.toLowerCase().toCharArray()){
            hash[ch-'a']++;
        }
        for(int ch:t.toLowerCase().toCharArray()){
            hash[ch-'a']--;
        }
        for(int i:hash){
            if(i!=0){
                return false;
            }
        }
        return true;

    }
}