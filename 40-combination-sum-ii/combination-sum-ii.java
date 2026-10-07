class Solution {

    public void solve(int[] candidates, int target, int idx,
                      List<Integer> output, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(output));
            return;
        }

        if (idx >= candidates.length || target < 0) {
            return;
        }

        // Pick
        output.add(candidates[idx]);

        solve(candidates, target - candidates[idx],
              idx + 1, output, ans);

        output.remove(output.size() - 1);

        // Not pick
        while (idx + 1 < candidates.length &&
               candidates[idx] == candidates[idx + 1]) {
            idx++;
        }

        solve(candidates, target, idx + 1, output, ans);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        solve(candidates, target, 0, output, ans);

        return ans;
    }
}