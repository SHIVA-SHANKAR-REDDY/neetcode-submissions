class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new LinkedList<>();
        int n=nums.length;
        int idx=0;
        int[] ans=new int[n-k+1];
        


        for(int i=0;i<nums.length;i++)
        {
            // Remove indices outside the window
            while(!dq.isEmpty() && dq.peekFirst()<=i-k)
            {
                dq.pollFirst();
            }
            // Remove smaller indices in the window
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
            {
                dq.pollLast();
            }
            dq.offerLast(i);

            if(i>=k-1)
            {
                ans[idx++]=nums[dq.peekFirst()];
            }
        }
        return ans;
        
        
    }
}
