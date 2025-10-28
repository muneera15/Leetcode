class Solution {
    public int trap(int[] height) {
        int ans= 0; 
        int low = 0; 
        int l_max = 0;
        int r_max = 0;
        int high = height.length - 1;
        while(low <= high){
            if(height[low] <= height[high]){
               l_max = Math.max(height[low] , l_max);
               ans += l_max - height[low];
               low ++;
            }
            else{
                r_max = Math.max(height[high], r_max);
                ans += r_max - height[high];
                high --;
            }
        }
        return ans;
    }
}