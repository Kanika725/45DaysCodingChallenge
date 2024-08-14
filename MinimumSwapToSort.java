class Solution {
    public void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int minSwaps(int nums[]) {
        int n = nums.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] numsSorted = nums.clone();
        Arrays.sort(numsSorted);
        
        for (int i = 0; i < n; i++) {
            map.put(numsSorted[i], i);
        }

        int swap = 0;
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (visited[i] || map.get(nums[i]) == i) {
                continue;
            }

            int j = i;
            int cycleSize = 0;

            while (!visited[j]) {
                visited[j] = true;
                j = map.get(nums[j]);
                cycleSize++;
            }

            if (cycleSize > 1) {
                swap += (cycleSize - 1);
            }
        }

        return swap;
    }
}
