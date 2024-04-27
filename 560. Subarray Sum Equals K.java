class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int num : nums){
            sum += num;
            int difference = sum-k;

            if(hm.containsKey(difference)){
                count += hm.get(difference);
            }
            
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}