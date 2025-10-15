class Solution {
    public void twoSum(List<List<Integer>> ans, int index, int target, int nums[] ){
        int i = index;
        int j = nums.length - 1;
        while(i < j){
            int b = nums[i];
            int c = nums[j];
            if(b + c == target){
                List<Integer> list = new ArrayList<>();
                list.add(-target);
                list.add(b);
                list.add(c);
                ans.add(list);
                i ++;
                while(i < j && nums[i] == nums[i - 1])
                    i ++;
                j --;
                while(i < j && nums[j] == nums[j + 1])
                    j --;
            }
            else if(b + c > target)
                j --;
            else
                i ++;
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> ans = new ArrayList<>();
       for(int i = 0; i < nums.length - 2; i ++){
            if(i == 0 || nums[i] != nums[i - 1]){
                int a = nums[i];
                twoSum(ans, i + 1, -a, nums);
            }
       }
       return ans;
    }
}