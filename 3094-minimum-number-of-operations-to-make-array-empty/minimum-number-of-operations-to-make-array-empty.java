import java.util.Collection;

class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        Map<Integer , Integer> freq = new HashMap<>();
        for(Integer num : nums)
        {
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        Collection<Integer> values = freq.values();
        // System.out.print(values);
        for(Integer i : values)
        {
            if(i == 1)
            {
                return -1;
            }
            else if(i % 3 == 0)
            {
                count += (i/3);
                // System.out.print(count+" 3");
            }
            else
            {
                count += ((i/3)+1);
                // System.out.print(count+" not 3");
            }
        }
        return count;
    }
}