class Solution {
    public boolean isvalid(int[]nums , int k,int maxPages){

        int stuCount=1;
        int pages=0;
        
        for(int i=0;i<nums.length;i++){
            if (pages+nums[i]<=maxPages) pages+=nums[i];
            else {
                stuCount++;
                if(stuCount>k ||nums[i]>maxPages) return false;
                else {
                    pages=0;
                    pages+=nums[i];
                }
            }
        }
        return true;

    }
    public int splitArray(int[] nums, int k) {

        int st=0;
        int end=0;
        int sum=0;
        int ans=0;
         
         for(int i=0;i<nums.length;i++){
            sum+=nums[i];
         }
         end=sum;

         while(st<=end){
            int mid=st+(end-st)/2;
            if(isvalid(nums,k,mid)){
                 ans=mid;
                end=mid-1;}
            
            else st=mid+1;
         }
         return ans;
        
    }
}