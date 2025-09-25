class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int prev = Integer.MIN_VALUE;
        for( int i = 0; i < nums.length; i ++){
            if(nums[i] != prev){
                prev = nums[i];
                nums[k] = nums[i];
                k ++ ;
            }
        }
        return k;
    }
}