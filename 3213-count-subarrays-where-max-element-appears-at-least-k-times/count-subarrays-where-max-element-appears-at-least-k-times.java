class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length;
        int maxElement=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            maxElement=Math.max(nums[i],maxElement);
        }
        int start=0;
        int end=0;
        long count=0;
        int maxEleFreq=0;

        while(end<n){
            if(nums[end]==maxElement) maxEleFreq++;

            while(maxEleFreq==k){
                count+= n-end;
                if(nums[start]==maxElement) maxEleFreq--;

                start++;
            }
            end++;
        }
        return count;
        
    }
}