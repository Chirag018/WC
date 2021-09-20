//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous/

public class minOperations {
    public int minOperations(int[] nums) {
        int l=nums.length;
       /* int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i:nums){
            if(max<i)
                max=i;
            if(min>i)
                min=i;
        }
        if(max-min>l+1)
            return l-min;
        
        return max-min==l?0:max-min-l+1;*/
        
        if(l==1)
            return 0;
        Arrays.sort(nums);
        int m=1;
        for(int i=1;i<l;i++){
            if(nums[i]!=nums[i-1])
                nums[m++]=nums[i];
            
        }
        int j=0,res=l;
        for(int i=0;i<m;i++){
            while(j<m && nums[j]<=l+nums[i]-1)
                j++;
            res=Math.min(res,l-j+i);
        }
        return res;
    }
}