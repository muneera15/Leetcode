class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i ++){
            int x = nums[i];
            int y = target - x;
            if(map.containsKey(y)){
                return new int[]{i, map.get(y)};
            }
            map.put(x,i);
        }
        return new int[]{};
    }
}