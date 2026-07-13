class Solution {
    public int rob(int[] nums) {
        int n=nums.length;

        if(n==1)
        {
            return nums[0];
        }
        if(n==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        if(n==3)
        {
            return Math.max(Math.max(nums[0],nums[1]),nums[2]);
        }
        int b=nums[n-2];
        int max=nums[n-1];
        int temp=0;
        for(int i=n-3;i>=1;i--)
        {
            temp=nums[i]+max;
            max=Math.max(b,max);
            b=temp;
        }
        int result1=Math.max(b,max);

        b=nums[n-3];
        max=nums[n-2];
        temp=0;
        for(int i=n-4;i>=0;i--)
        {
            temp=nums[i]+max;
            max=Math.max(b,max);
            b=temp;
        }
        int result2=Math.max(b,max);
        return Math.max(result1,result2);
        
    }
}
