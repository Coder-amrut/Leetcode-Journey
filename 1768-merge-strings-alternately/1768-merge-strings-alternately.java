class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();

        char[] word11 = word1.toCharArray();
        char[] word22 = word2.toCharArray();

        int i=0;
        while(word1.length() > i || word2.length() > i ){
            if(i < word11.length){
                ans.append(word11[i]);
            }
            if(i < word22.length){
                ans.append(word22[i]);
            }
            i++;
        }
        return ans.toString();
    }
}