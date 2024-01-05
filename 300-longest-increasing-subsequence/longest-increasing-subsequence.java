class Solution {
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] lis = new int[len];
        Arrays.fill(lis,1);
        for(int i = 1; i < len ; i++)
        {
            for(int j = 0 ; j < i ; j++)
            {
                if(nums[j] < nums[i] && lis[j] + 1 > lis[i])
                {
                    lis[i] = lis[j] + 1;
                }
            }

        }
        Arrays.sort(lis);
        return lis[len - 1];
    }
}