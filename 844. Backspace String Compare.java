class Solution {
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
    }
    public static String check(String str){
        StringBuilder res = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch=='#'){
                if(res.length()>0){
                    res.deleteCharAt(res.length()-1);
                }
            }else{
                res.append(ch);
            }
        }
        return res.toString();
    }
}