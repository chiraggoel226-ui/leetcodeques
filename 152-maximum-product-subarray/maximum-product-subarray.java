class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int answer = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];

            if (x < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(x, maxProd * x);
            minProd = Math.min(x, minProd * x);

            answer = Math.max(answer, maxProd);
        }

        return answer;
    }
}
