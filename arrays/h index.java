class Solution {
    public int hIndex(int[] c) {
        int a =c.length;
        int[] b =new int[a+1];
        for(int i : c){
            if(i>a){
                b[a]++;
            }
            else{
                b[i]++;
            }
        }
        int count =0;
        for(int j =a;j>=0;j--){
            count=count+b[j];
            if(count>=j){
                return j;
            }
        }
        return 0;
    }
}