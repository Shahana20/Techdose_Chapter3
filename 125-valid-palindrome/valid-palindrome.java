class Solution {

    public boolean isEqual(char ch1, char ch2)
    {
        return Character.toLowerCase(ch1) == Character.toLowerCase(ch2);
    }

    public boolean isPalindrome(String s) {
        String str = s.trim().replaceAll("[^A-Za-z0-9]", "");
        System.out.print(str);
        if(str.length() == 0)
        {
            return true;
        }
        int left = 0;
        int right = str.length() - 1;
        while(left < right)
        {
            if(!isEqual(str.charAt(left) , str.charAt(right)))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}