class Solution {
    public boolean campare(String haystack, String needle,int idx){
        int n1  = haystack.length();
        int n2 = needle.length();
        for(int j=0;j<n2;j++){
            if (idx>=n1){
                return false;
            }
            if(haystack.charAt(idx++)!=needle.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public int strStr(String haystack, String needle) {
        int n1  = haystack.length();
        int n2 = needle.length();
        for (int i =0;i<n1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(campare(haystack,needle,i)==true){
                    return i;
                }
            }
        }
        return -1;
    }
}
