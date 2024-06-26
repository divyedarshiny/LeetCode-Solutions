class Solution {
    public int compress(char[] chars) {
        int current = 0;
        int write = 0;
        while(current < chars.length){
            chars[write++]  = chars[current];
            int count = 1;

            while(current+1 < chars.length && chars[current]==chars[current+1]){
                count++;
                current++;
            }

            if(count>1){
                char[] countChars = String.valueOf(count).toCharArray();
                for(char ch : countChars){
                    chars[write++] = ch;
                }
            }

            current++;
        }
        return write;
    }
}