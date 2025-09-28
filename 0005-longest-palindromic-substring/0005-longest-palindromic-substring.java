class Solution {
    // public Boolean isPalindrome(String s) {
    //     int i = 0;
    //     int j = s.length() - 1;
    //     while(i <= j){
    //         if(s.charAt(i) != s.charAt(j))
    //             return false;
    //         i ++;
    //         j --;
    //     }
    //     return true;
    // }
    public String longestPalindrome(String s) {
        int len = s.length();
        int maxLen = 0;
        String ans = "";

    //odd length plaindromic substring

        for(int mid = 0; mid < len; mid++){
            int i = mid - 1;
            int j = mid + 1;
            int curLen = 1;
            while(i >= 0 && j < len && s.charAt(i) == s.charAt(j)){
                i --;
                j ++;
                curLen += 2;
            }
            if(curLen > maxLen){
                ans = s.substring(i + 1, j);
                maxLen = curLen;
            }
        }

        // even length palindromic substring
        
        for(int mid = 0; mid < len; mid ++){
            int i = mid;
            int j = mid + 1;
            int curLen = 0;

            while(i >= 0 && j < len && s.charAt(i) == s.charAt(j)){
                i --;
                j ++;
                curLen += 2;
            }
            if(curLen > maxLen){
                ans = s.substring(i+ 1, j);
                maxLen = curLen;
            }
        }
        return ans;

        // String longestPalindromeString = "";
        // for(int i = 0; i < len; i ++){
        //     String subStr = "";
        //     for(int j = i; j < len; j ++){
        //         subStr += s.charAt(j);
        //     if(isPalindrome(subStr) && subStr.length() > longestPalindromeString.length())
        //         longestPalindromeString = subStr;
        //     }
        // }
        // return longestPalindromeString;
    }
}