package C240;
//https://leetcode.com/problems/maximum-population-year/
public class maxPopulation {
    public int maximumPopulation(int[][] logs) {
    int year[]=new int[2051];
        for(int i[]:logs){
            year[i[0]]++;
            year[i[1]]--;
        }
        int maxNo=year[1950],maxYr=1950;
        for(int i=1951;i<2051;i++){
            year[i]+=year[i-1];
            if(year[i]>maxNo){
                maxNo=year[i];
                maxYr=i;
            }
        }
        return maxYr;
    }
}