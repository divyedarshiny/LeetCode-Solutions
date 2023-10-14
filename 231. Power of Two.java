class Solution {
    public boolean isPowerOfTwo(int n) {
        while(n<=0){
            return false;
        }
        for(int i=0;i<=Math.sqrt(n)+1;i++){
            if(n==Math.pow(2,i)){
                return true;
            }
        }
        return false;
    }
}