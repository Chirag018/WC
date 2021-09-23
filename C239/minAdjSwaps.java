package C239;
//https://leetcode.com/problems/minimum-adjacent-swaps-to-reach-the-kth-smallest-number/


public class minAdjSwaps {
    
    public int getMinSwaps(String num, int k) {
        char arr[]=num.toCharArray();
        for(int i=0;i<k;i++)
            nextPermutation(arr);
        char orig[]=num.toCharArray();
        return countStep(orig,arr,arr.length);
    }
    
    void nextPermutation(char arr[]){
        int l=arr.length;
        if(l==0)
            return ;
        for(int i=l-1;i>=1;i--){
            if(arr[i]>arr[i-1]){
                reverse(arr,i);
                for(int j=i;j<l;j++){
                    if(arr[j]>arr[i-1]){
                        swap(arr,i-1,j);
                        return ;
                    }
                }
            }
        }
        reverse(arr,0);
    }
    void reverse(char arr[],int i){
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    void swap(char arr[],int i,int j){
        char t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    int countStep(char s1[],char s2[],int l){
        int i=0,j=0,count=0;
        while(i<l){
            j=i;
            while(s1[j]!=s2[i])
                j++;
            while(i<j){
                swap(s1,j,j-1);
                j--;
                count++;
            }
            i++;
        }
        return count;
    }
}