class Solution {
    public boolean isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public void swap(char[] arr , int index1 , int index2)
    {
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        while(left < right)
        {
            // System.out.println(s.charAt(left)+" "+s.charAt(right));
            if(isVowel(arr[left]) && isVowel(arr[right]))
            {
                swap(arr , left , right);
                // System.out.println(s.charAt(left)+" "+s.charAt(right));
                left++;
                right--;
            }
            else if(isVowel(arr[left]))
            {
                right--;
            }
            else if(isVowel(arr[right]))
            {
                left++;
            }
            else
            {
                left++;
                right--;
            }
            
        }
        return new String(arr);
    }
}