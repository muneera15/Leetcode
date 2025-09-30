class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       List<Integer> res = new ArrayList<>();
       for( int i = 0; i < words.length; i ++){
        String word = words[i];
        for(char ch : word.toCharArray()){
            if(ch == x){
                res.add(i);
                break;
            }
        }
       }
       return res;
    }
}