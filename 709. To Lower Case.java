class Solution {
    public String toLowerCase(String s) {
        char[] charArr = s.toCharArray();
        for(int i=0;i<charArr.length;i++){
            if(charArr[i]>='A' && charArr[i]<='Z'){
                charArr[i]+=32;
            }
        }
        return String.valueOf(charArr);
    }
}