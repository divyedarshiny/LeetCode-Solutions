class Solution {
    public int pivotInteger(int n) {
        int totalSum = (n*(n+1))/2;
        int currSum =0;
        for(int x=n;x>0;x--){
            currSum += x;
            if(currSum == totalSum){
                return x;
            }
            totalSum -= x;
        }
        return -1;
    }
}