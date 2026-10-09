class Solution {
    public void solve(String digits, String[] mapping,int index,List<String> result, StringBuilder output){
        if(index>=digits.length()){
            result.add(output.toString());
            return;
        }
        int value = digits.charAt(index)-'0';

        String mappedstring= mapping[value];

        for(int i=0;i<mappedstring.length();i++){
            output.append(mappedstring.charAt(i));
            solve(digits,mapping,index+1,result,output);
            output.deleteCharAt(output.length()-1);
        }





    }
    public List<String> letterCombinations(String digits) {
        String [] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> ans=new ArrayList<>();
        int index=0;
        StringBuilder output=new StringBuilder();
        solve(digits,mapping,index,ans,output);
        return ans;

        
    }
}