class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[n - 1] = nums[n - 1];

        for(int i = n - 2; i >= 0; i --)
            answer[i] = nums[i] * answer[i + 1];
        int lp = 1;
        for(int i = 0; i < n; i ++){
            int leftproduct = (i == 0)? 1 : lp;
            int rightproduct = (i == n - 1)? 1 : answer[i + 1];
            answer[i] = leftproduct * rightproduct;
            lp *= nums[i];
        }
    return answer;
    }
}