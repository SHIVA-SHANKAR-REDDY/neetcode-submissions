class Solution {
    public int search(int[] nums, int target) {

        int start=0;
        int end=nums.length;
        while(start<=end && start<nums.length)
        {
            int mid=(start+end)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid]<target)
            {
                start=mid+1;
            }
            else if(nums[mid]>target)
            {
                end=mid-1;
            }
            
        }
        return -1;

        
    }
}
