class removeDuplicates1{
    public int removeDuplicates(int[] nums) {
        int a = 0;
        if (nums.length==0){
            return 0;
        }
        for(int i = 0;i<nums.length;i++){
            if (nums[i]!=nums[a]){
                a++;
                nums[a]=nums[i];
            }
        
        }
        return a+1;
    }
}