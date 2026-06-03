class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int a=cost[n-1];
        int b=cost[n-2];
        int temp=0;
        for(int i=n-3;i>=0;i--)
        {
            temp=cost[i]+Math.min(b,a);
            a=b;
            b=temp;
        }
        return Math.min(a,b);
    }
}
