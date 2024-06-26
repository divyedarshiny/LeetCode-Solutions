class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";

        Stack<Character> stack = new Stack<>();

        for(char digit : num.toCharArray()){
            while(k>0 && !stack.isEmpty() && stack.peek()>digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while(k>0){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0,stack.pop());
        }

        //to remove leading zeroes
        int index =0;
        while(index<sb.length() && sb.charAt(index)=='0'){
            index++;
        }

        return index==sb.length() ? "0" : sb.substring(index);
    }
}