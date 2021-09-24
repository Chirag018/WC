package C240;
//https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/
public class maxDisbtwPairs {

    public int maxDistance(int[] nums1, int[] nums2) {
     //this method works but for larger input it can cause TLE.
     /*   int max=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(i<=j && nums1[i]<=nums2[j]){
                    max=Math.max(max,j-i);
                }
            }
        }
        return max;*/
        int i=0,j=0,res=0,l1=nums1.length,l2=nums2.length;
        while(i<l1 && j<l2){
            if(nums1[i]>nums2[j])
                i++;
            else{
                res=Math.max(res,j-i);
                j++;
            }
        }
        return res;
    }
}