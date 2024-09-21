class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
            int l = nums.length;
            reverse(nums,0,l-1);
            reverse(nums,0,k-1);
            reverse(nums,k,l-1);
    }

    public static void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}