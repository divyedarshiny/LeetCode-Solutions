class Solution {
    public int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex = 0;
        
        while(readIndex < chars.length){
            char currentChar = chars[readIndex];
            int count = 0;
            while(readIndex<chars.length && currentChar == chars[readIndex]){
                readIndex++;
                count++;
            }
            chars[writeIndex] = currentChar;
            writeIndex++;
            if(count>1){
                for(char digit : Integer.toString(count).toCharArray()){
                    chars[writeIndex++] = digit;
                }
            }
        }
        return writeIndex;
    }
}