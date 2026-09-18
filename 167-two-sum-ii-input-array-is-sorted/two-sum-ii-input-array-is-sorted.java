class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
    

        int low=0;
        int high=n-1;

        while(low<high){
            int a=numbers[low];
            int b=numbers[high];

            if(a+b< target) low++;
             else if(a+b>target) high--;
             else  return new int[]{low+1 , high +1};

        }
        

        return new int[]{low+1 , high+1 };


        
    }
}