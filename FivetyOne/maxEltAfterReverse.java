package FivetyOne;

//https://leetcode.com/problems/maximum-element-after-decreasing-and-rearranging/
//
import java.util.Arrays;

public class maxEltAfterReverse {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
       int res=0;
        Arrays.sort(arr);
        for(int i:arr){
            res=Math.min(res+1,i);
        }
        return res;
    }
}