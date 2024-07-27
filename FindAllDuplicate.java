import java.util.*;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int []seen=new int[nums.length+1];
        ArrayList<Integer> ans=new ArrayList<Integer>();
       for(int i:nums){
        if(seen[i]!=0){
            ans.add(i);
        }
        else{
            seen[i]=i;
        }
       }
       return ans;
    }
}