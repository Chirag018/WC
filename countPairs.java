//https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/


class Solution {
    public int countKDifference(int[] nums, int k) {
      /*  int count=0;
       for(int i=0;i<nums.length;i++){
           for(int j=0;j<nums.length;j++){
               if(i<j && Math.abs(nums[i]-nums[j])==k)
                   count++;
           }
       }  
        return count;*/
        int count=0,res=0;
      
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
            count+=map.getOrDefault(i-k,0)+map.getOrDefault(i+k,0);
        }
        
        return res+count;
    }
}