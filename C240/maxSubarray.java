package C240;

import java.util.Stack;

//https://leetcode.com/problems/maximum-subarray-min-product/
public class maxSubarray {
    public int maxSumMinProduct(int[] nums) {
      /*  int min=Integer.MAX_VALUE,sum=0,res=0;
        for(int i=0;i<nums.length;i++){
            min=Integer.MAX_VALUE;
            sum=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]>=nums[j-1] && j!=0)
                   sum+=nums[j];
                sum+=nums[j];
                min=Math.min(min,nums[j]);
            }
            res=Math.max(res,min*sum);
        }
        return res;*/
        
        Stack<Integer> s=new Stack<>();
        int l=nums.length;
        long dp[]=new long[l+1],res=0;
        for(int i=0;i<l;i++)
            dp[i+1]=dp[i]+nums[i];
        for(int i=0;i<l+1;i++){
            while(!s.isEmpty() && (i==l || nums[s.peek()]>nums[i] )){
                int j=s.pop();
                res=Math.max(res,(dp[i]-dp[s.empty() ? 0: s.peek()+1])*nums[j]);
            }
            s.push(i);
        }
        return (int)(res%1000000007);
    }
}

/*
Similar Stack problems:

https://leetcode.com/problems/largest-rectangle-in-histogram/
https://leetcode.com/problems/sum-of-subarray-minimums/
https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/
https://leetcode.com/problems/sliding-window-maximum/
*/