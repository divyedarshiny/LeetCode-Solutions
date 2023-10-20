class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            while(left<right && vowels.indexOf(arr[left])==-1){
                left++;
            }
            while(left<right && vowels.indexOf(arr[right])==-1){
                right--;
            }
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(arr);
        
    }
}