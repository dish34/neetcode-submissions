class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> checkNum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (checkNum.containsKey(complement)) {
                return new int[]{checkNum.get(complement), i};
            }
            checkNum.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
