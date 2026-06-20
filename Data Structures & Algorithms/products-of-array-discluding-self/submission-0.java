class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        int[] answer=new int[nums.length];
        int p=1;
        for(int i=0;i<nums.length;i++)
        {
            prefix[i]=p;
            p=nums[i]*p;
        }
        int s=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            suffix[i]=s;
            s=nums[i]*s;
            answer[i]=prefix[i]*suffix[i];
        }
        return answer;
    }
}  
