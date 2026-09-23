class Solution {
    public int maxArea(int[] height) {

        int st=0;
        int end=height.length-1;
        int ans=0;
        
        
        while (st<=end){
            int h= Math.min(height[st],height[end]);
            int w=end-st;
            int area=h*w;
            ans=Math.max(area,ans);

            if(height[st]<height[end]) st++;
            else end--;
            
        }
        return ans;
        
    }
}