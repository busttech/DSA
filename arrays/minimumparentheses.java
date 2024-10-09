//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
class Solution {
    public int minAddToMakeValid(String s) {
        int openBr = 0;    
        int closeBr = 0;  
        int count = 0;   

        for (int i =0;i<s.length();i++){
            if(s.charAt(i) == '('){
                openBr += 1;
            }
            else{
                closeBr += 1;
            }
            if(closeBr > openBr){
                count += (closeBr-openBr);
                openBr = 0;
                closeBr = 0;
            }

        
        }
        count += (openBr-closeBr);

    return count;
    }
}
