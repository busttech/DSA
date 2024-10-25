class Solution {
    public boolean isPalindrome(String s) {
        int lef =0;
        int right = s.length()-1;
        s = s.toLowerCase(); 
        while(lef<right){
            char ch1 = s.charAt(lef);
            char ch2 = s.charAt(right);
            if (!(ch1>='a'&&ch1<='z' || ch1>='0'&&ch1<='9')){
                lef++;
                continue;
            }
            if (!(ch2>='a'&&ch2<='z' || ch2>='0'&& ch2<='9')){
                right--;
                continue;
            }
            if(ch1!=ch2){
                return false;
            }
            lef++;
            right--;

            
        }
        return true;      
    }
}