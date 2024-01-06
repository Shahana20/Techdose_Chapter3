class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        if(size == 1 && flowerbed[0] == 0 && n <= 1)
        {
            return true;
        }
        if(flowerbed[0] == 0 && flowerbed[1] == 0)
        {
            flowerbed[0] = 1;
            n--;
        }
        for(int i = 1 ; i < size - 1 ; i++)
        {
            if(flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0)
            {
                flowerbed[i] = 1;
                n--;
            }
        }
        if(flowerbed[size - 1] == 0 && flowerbed[size - 2] == 0)
        {
            flowerbed[size - 1] = 1;
            n--;
        }

        return (n <= 0);
    }
}