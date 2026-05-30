class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(0,nums,new ArrayList<>());
        return result;
    }
    public void backtrack(int pos,int[] nums,List<Integer> current)
    {
        // if(result.contains(current))
        // {
        //     return;
        // }
        result.add(new ArrayList<>(current));
        for(int i=pos;i<nums.length;i++)
        {
            //Skip Duplicates
            if(i>pos && nums[i]==nums[i-1])
            {
                continue;
            }
            //CHOOSE
            current.add(nums[i]);
            //EXPLORE
            backtrack(i+1,nums,current);
            //UNDO
            current.remove(current.size()-1);
        }
    }
}
