class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int leftSum = 0;
        
        // Step 1: Compute the sum of the first k cards
        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }
        
        int maxSum = leftSum;
        int rightSum = 0;
        
        // Step 2: Slide the window from the end
        for (int i = 0; i < k; i++) {
            rightSum += cardPoints[n - 1 - i];
            leftSum -= cardPoints[k - 1 - i];
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        
        return maxSum;
    }
}
