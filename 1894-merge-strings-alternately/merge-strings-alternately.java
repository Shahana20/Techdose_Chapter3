class Solution {
    public String mergeAlternately(String word1, String word2) {
        int size=Math.max(word1.length(),word2.length());
        // System.out.println(size);
        StringBuilder res = new StringBuilder();
        for(int i=0;i<size;i++)
        {
            if(i<word1.length())
            {
                res.append(word1.charAt(i));
            }
            if(i<word2.length())
            {
                res.append(word2.charAt(i));
            }
        }
        
        return res.toString();
    }
}