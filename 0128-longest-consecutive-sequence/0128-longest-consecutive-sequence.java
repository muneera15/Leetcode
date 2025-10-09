class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLen = 1;
        if(nums.length == 0){
            return maxLen = 0;
        }
        for(int num : nums)
            set.add(num);

        for(int startElem : set){
            if(!set.contains(startElem - 1)){
                int len = 1;
                while(set.contains(startElem + len)){
                    len ++;
                    maxLen = Math.max(maxLen , len);
                }
            }
        }
        return maxLen;
    }
}