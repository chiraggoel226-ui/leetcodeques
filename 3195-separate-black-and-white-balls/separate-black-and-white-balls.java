class Solution {
    public long minimumSteps(String s) {
        long ones=0;
        long zeroleft=0;
        for(int i=0;i<=s.length()-1;i++){
            if (s.charAt(i)=='1') ones++;
            else zeroleft+=ones;
        }
        return zeroleft;
        
    }
}