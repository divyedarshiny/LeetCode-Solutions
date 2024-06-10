class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int maxCount = 0;

        for (int num : nums) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxCount = 1;
            } else if (frequency == maxFrequency) {
                maxCount++;
            }
        }

        return maxFrequency * maxCount;
    }
}
