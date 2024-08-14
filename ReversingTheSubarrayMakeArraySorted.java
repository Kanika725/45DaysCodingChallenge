public class ReversingTheSubarrayMakeArraySorted {
        public boolean canBeSortedByReversingSubarray(int[] arr, int n) {
            int start = -1, end = -1;
    
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    start = i;
                    break;
                }
            }
    
            if (start == -1) return true;
    
            for (int i = n - 1; i > 0; i--) {
                if (arr[i] < arr[i - 1]) {
                    end = i;
                    break;
                }
            }
    
            if ((start == 0 || arr[start - 1] <= arr[end]) && 
                (end == n - 1 || arr[start] <= arr[end + 1])) {
                while (start < end) {
                    if (arr[start] < arr[start + 1]) {
                        return false;
                    }
                    start++;
                }
                return true;
            }
            
            return false;
        }
        public static void main(String[] args) {
            int arr[]={2,3,4,5,6,0};
            int n = arr.length; 

            ReversingTheSubarrayMakeArraySorted obj = new ReversingTheSubarrayMakeArraySorted();
            boolean result = obj.canBeSortedByReversingSubarray(arr, n);

            System.out.println(result);


        }
}
