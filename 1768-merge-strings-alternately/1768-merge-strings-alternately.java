class Solution {
    public String mergeAlternately(String word1, String word2) {
        List<Character> ab = new ArrayList<>();
        char[] word11 = word1.toCharArray();
        char[] word22 = word2.toCharArray();
        int i=0;
        while(word1.length() > i || word2.length() > i){
            if(i<word11.length){
                ab.add(word11[i]);
                //break;
            }
            if(i<word22.length){
                ab.add(word22[i]);
                //break;
            }
            i++;
        }
        StringBuilder ans = new StringBuilder();
        for(char ch : ab){
            ans.append(ch);
        }
        return ans.toString();
        
    }
}