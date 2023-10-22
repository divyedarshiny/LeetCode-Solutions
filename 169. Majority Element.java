class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int num : nums){
            if(m.containsKey(num)){
                m.put(num,m.get(num)+1);
            }else{
                m.put(num,1);
            }
        }

        for(Map.Entry<Integer,Integer> entry : m.entrySet()){
            if(entry.getValue()>nums.length/2){
                return entry.getKey();
            }
        }
        return -1;
        
    }
}