class Solution {
    public int minSwaps(int[] nums) {

        int n = nums.length;
        int totalOnes = 0;

        for (int i = 0; i < n; i++) {
            totalOnes += nums[i];
        }

        int zeroCount = 0;

        for (int i = 0; i < totalOnes; i++) {
            if (nums[i] == 0)
                zeroCount++;
        }

        int minCount = zeroCount;
        int start = 0;
        int end = totalOnes - 1;

        while (start < n) {

            if (nums[start] == 0) {
                zeroCount--;
            }

            start++;
            end++;

            if (nums[end % n] == 0) {
                zeroCount++;
            }

            minCount = Math.min(minCount, zeroCount);
        }

        return minCount;
    }
}