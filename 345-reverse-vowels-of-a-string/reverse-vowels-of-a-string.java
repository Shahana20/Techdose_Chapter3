class Solution {
    public boolean isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u';
    }
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        List<Character> vowel = new ArrayList<>();

        for(char ch : str)
        {
            if(isVowel(ch)) vowel.add(ch);
        }

        int index = vowel.size() - 1;
        for(int i = 0 ; i < str.length ; i++)
        {
            if(isVowel(str[i]))
            {
                str[i] = vowel.get(index);
                index--;
            }
        }
        return new String(str);
    }
}