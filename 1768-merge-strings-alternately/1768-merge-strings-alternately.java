class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans = new StringBuilder();

        //char[] word1 = word1.toCharArray();
        //char[] word22 = word2.toCharArray();

        int i=0;
        while(word1.length() > i || word2.length() > i ){
            if(i < word1.length()){
                ans.append(word1.charAt(i));
            }
            if(i < word2.length()){
                ans.append(word2.charAt(i));
            }
            i++;
        }
        return ans.toString();
    }
}