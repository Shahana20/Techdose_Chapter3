class Solution {
    public double myPow(double x, int n) {
        double res = 1.0;
        long base = n;
        if(base < 0)
        {
            base = -1 * base;
        }
        while(base > 0)
        {
            if(base % 2 == 1)
            {
                res *= x;
            }
            x *= x;
            base /= 2;
        }
        if(n < 0)
        {
            res = 1.0 / res;
        }
        return res;
    }
}