class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[] arr = new int[128];
       Arrays.fill(arr,-1);
       
       int start=0;
       int maxLen = 0;
       for(int end=0;end<s.length();end++){
            //if the same character in the string is encountered again
            if(arr[s.charAt(end)] >= start){
                start = arr[s.charAt(end)]+1;
            }

            arr[s.charAt(end)] = end;
            maxLen = Math.max(maxLen, end-start+1);
       }
       return maxLen;
    }
}