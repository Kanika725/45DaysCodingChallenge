class Solution
{
    static int missingNumber(int arr[], int size)
    {
        Arrays.sort(arr);
        int num = 1;
        for(int i=0;i<size;i++){
            if(arr[i]==num && arr[i]>=1){
                num++;
            }
        }
        return num;
    }
}