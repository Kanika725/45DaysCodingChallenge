class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int medianElement = nums[len/2];
        int count = 0;
        for(int el : nums){
            count+=Math.abs(el-medianElement);
        }
        return count;
        
    }
}