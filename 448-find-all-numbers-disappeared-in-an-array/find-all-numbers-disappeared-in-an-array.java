class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans =new ArrayList<>();

        int n=nums.length;
        for (int num:nums){
            int  idx =Math.abs(num)-1;

            if(nums[idx]>0) {
                nums[idx]=-nums[idx];
            }


        }
        for (int i=0;i<n;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;

        
    }
}