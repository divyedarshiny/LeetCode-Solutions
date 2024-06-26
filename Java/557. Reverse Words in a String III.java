class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i>0)
                sb.append(" ");
            sb.append(new StringBuilder(arr[i]).reverse());
        }
        return sb.toString();
    }
}