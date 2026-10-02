class Solution {
    public int majorityElement(int[] nums) {
        //Boyers More Voting ALgorithm
        int candidate=Integer.MAX_VALUE;
        int count=0;
        for(int num:nums)
        {
            if(candidate==num)
            {
                count++;
            }
            else if(count==0)
            {
                candidate=num;
            }
            else
            {
                count--;
            }
        }
        return candidate;
    }
}