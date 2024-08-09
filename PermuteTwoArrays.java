class Solution {
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        Arrays.sort(arr1);  
        Arrays.sort(arr2); 
        reverse(arr2); 

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] + arr2[i] < k) {
                return false; 
            }
        }
        return true; 
    }

    public void reverse(int arr[]) {
        int l = 0; 
        int r = arr.length - 1; 

        while (l < r) {
            int temp = arr[l]; 
            arr[l] = arr[r]; 
            arr[r] = temp; 

            l++; 
            r--; 
        }
    }
}