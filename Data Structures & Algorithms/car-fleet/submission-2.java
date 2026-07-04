class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        float[] cal=new float[target+1];
        for(int i=0;i<position.length;i++){
            cal[position[i]]=(float)(target-position[i])/speed[i];
        }
        float prev=cal[target];
        int cnt=0;
        for(int i=target-1;i>=0;i--){
            if(cal[i]>prev){
                cnt++;
                prev=cal[i];
            }
        }
        return cnt;
    }
}