class Solution {
    public int romanToInt(String s) {
        int add = 0;
        for(int i =0;i<s.length();i++){
            if (s.charAt(i)=='I'){
                add+= 1;
            }
            else if (s.charAt(i)=='V'){
                add+=5;
            }
            else if (s.charAt(i)=='X'){
                add+= 10;
            }
            else if (s.charAt(i)=='L'){
                add+= 50;
            }
            else if (s.charAt(i)=='C'){
                add+= 100;
            }
            else if (s.charAt(i)=='D'){
                add+= 500;
            }
            else if (s.charAt(i)=='M'){
                add+= 1000;
            }
        }
    return add;
    }
}
