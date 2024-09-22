class Solution {
    public int majorityElement(int[] nums) {
        int p =0;
        int k = 0;
        int t = 0;
        if (nums.length ==1){
            return nums[0];
        }
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    p++;
                    
                }
            }
            
            if (p>k){
                k = p;
                p = 0;
                t = nums[i];
            }
            p =0;
            
        }
    return t;
        
    }
}