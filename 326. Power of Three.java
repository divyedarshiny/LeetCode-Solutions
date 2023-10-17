class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <=0){
            return false;
        }
        for(int i=0;i<Math.sqrt(n);i++){
            if(n==Math.pow(3,i)){
                return true;
            }
        }
        return false;
        
    }
}
