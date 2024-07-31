class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int reachIndex=0;
        for(int i=0; i<n; i++){
            if(reachIndex<i){
                return false;
            }
      reachIndex= Math.max(reachIndex,i+nums[i]);
        }
        return true;
    }
}