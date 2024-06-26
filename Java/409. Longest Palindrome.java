class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> dict = new HashMap<>();
        for(char ch:s.toCharArray()){
                if(dict.containsKey(ch)){
                    dict.put(ch,dict.get(ch)+1);
                }else{
                    dict.put(ch,1);
                }
        }
        int longestLength =0;
        boolean isOdd = false;
        
        for(int val : dict.values()){
            if(val%2==0){
                longestLength += val;
            }else{
                longestLength += val-1;
                isOdd = true;
            }
        }

        if(isOdd){
            longestLength++;
        }
        return longestLength;
      }
}
