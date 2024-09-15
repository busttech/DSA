class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int j=0;
        int n= nums.length;

        while(i!=n){
            if(nums[i]!=val){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        return j;
    }
    public static void main(String[] args) {
        Solution n = new Solution();
        int[] numes= {1,2,3,4,4,5};
        int k = 0;
        int val = 4;
        System.out.println(n.removeElement(numes,val));
        int j = numes.length;
        if (k !=(j-1)){
            for (int i:numes){
                System.out.println(i);
                k++;
            }
        }
        
    }
}
