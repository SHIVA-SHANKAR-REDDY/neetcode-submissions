class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        {
            return nums[0];
        }
        int b=nums[n-2];
        int max=nums[n-1];
        int temp=0;
        for(int i=n-3;i>=0;i--)
        {
            temp=nums[i]+max;
            max=Math.max(b,max);
            b=temp;
        }
        return Math.max(b,max);
        
    }
}
