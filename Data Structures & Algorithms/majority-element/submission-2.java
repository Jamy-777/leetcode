class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> counts = new HashMap<>();

        int majorityElement = nums.length/2, count = 0;

        for (int num : nums) {
            count = counts.getOrDefault(num, 0) + 1;
            counts.put(num, count);

            if (count > majorityElement) {
                return num;
            }
        }

        return -1;
    }
}