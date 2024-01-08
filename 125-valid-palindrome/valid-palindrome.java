class Solution {

    public boolean isEqual(char ch1, char ch2)
    {
        return Character.toLowerCase(ch1) == Character.toLowerCase(ch2);
    }

    public boolean isPalindrome(String s) {
        String str = s.trim().replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(str);
        StringBuilder newStr = new StringBuilder(str);
        newStr.reverse();
        String reversed = newStr.toString();
        System.out.println(reversed);
        return str.equals(reversed);
        
    }
}