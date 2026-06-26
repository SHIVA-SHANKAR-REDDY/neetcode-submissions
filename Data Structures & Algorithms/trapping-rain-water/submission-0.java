class Solution {
    public int trap(int[] height) {
        int[] prefix=new int[height.length];
        int[] suffix=new int[height.length];
        prefix[0]=0;
        for(int i=1;i<height.length;i++)
        {
            prefix[i]=Math.max(height[i-1],prefix[i-1]);
        }
        suffix[height.length-1]=0;
        for(int i=height.length-2;i>=0;i--)
        {
            suffix[i]=Math.max(height[i+1],suffix[i+1]);
        }
        int coveredArea=0;
        for(int i=0;i<height.length;i++)
        {
            if(Math.min(prefix[i],suffix[i]) - height[i]<0)
            {
                continue;
            }
            coveredArea+=Math.min(prefix[i], suffix[i]) - height[i];
        }
        return coveredArea;

    }
}
