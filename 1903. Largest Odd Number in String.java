class Solution {
    public String largestOddNumber(String num) {
       int s = num.length()-1;
       while(s>=0){
       if(num.charAt(s) %2 !=0){
           return num.substring(0,s+1);
       }
       s=s-1;
       }
       return "";
    }
}