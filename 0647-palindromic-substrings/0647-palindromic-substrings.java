class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        //odd length palindrome
        for(int mid = 0; mid < n; mid ++){
            int i = mid;
            int j = mid;
            while(i >= 0 && j < n && s.charAt(i) == s.charAt(j)){
                count ++;
                i --;
                j ++;
            }
        }
        //even length palindrome
        for(int mid = 0; mid < n; mid ++){
            int i = mid;
            int j = mid + 1;
            while( i >= 0 && j < n && s.charAt(i) == s.charAt(j)){
                count ++;
                i --;
                j ++;
            }
        }
        return count;
    }
}