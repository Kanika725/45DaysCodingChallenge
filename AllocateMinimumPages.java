class Solution {
    // Function to find minimum number of pages.
    public static int findPages(int N, int[] arr, int students) {
        
         if(N<students){
            return -1;
        }
        //Your code here
         int  start = Integer.MIN_VALUE;
        int end = 0;
        for (int i = 0; i < N; i++) {
            if(arr[i]>start){
                start=arr[i];
            }
            end+=arr[i];
        }
        int res=-1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isValid(arr, mid,students)) {
                res=mid;
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }
    static boolean isValid(int[] arr,  int maxpages, int students) {
        int currentStudents = 1;
        int pages = 0;
            int n=arr.length;
        for (int i = 0; i < n; i++) {
            pages += arr[i];
            if (pages > maxpages) {
                currentStudents+=1;
                pages = arr[i];
            }
            if(currentStudents>students){
                return false;
            }
        }

        return true;
        // Your code here
        
        
    }
};