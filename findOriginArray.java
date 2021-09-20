//https://leetcode.com/problems/find-original-array-from-doubled-array/

public class findOriginArray {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2!=0)
            return new int[0];
      int mid=changed.length/2;
    int res[]=new int[mid];
        int freq[]=new int[100001];
        for(int i:changed)
            freq[i]++;
        int index=0;
        for(int no=0;no<freq.length;no++){
            while(freq[no]>0 && no*2<100001 &&freq[no*2]>0){
                freq[no]--;
                freq[no*2]--;
                res[index++]=no;
            }
        }
        //Need of this loop
        
        
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
                return new int[0];
        }
        return res;
    }
}