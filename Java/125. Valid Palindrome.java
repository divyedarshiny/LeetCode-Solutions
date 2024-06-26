class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left++)!=s.charAt(right--)){
                return false;
            }

        }
        return true;
    }
}