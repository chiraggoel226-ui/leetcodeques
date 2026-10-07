class Solution {
    public void solve(int k, int n, int idx, List<Integer> output,
                      List<List<Integer>> ans) {

        if (k == 0) {
            if (n == 0) {
                ans.add(new ArrayList<>(output));
            }
            return;
        }

        if (idx > 9 || n < 0) {
            return;
        }

        output.add(idx);
        solve(k - 1, n - idx, idx + 1, output, ans);

        output.remove(output.size() - 1);

        solve(k, n, idx + 1, output, ans);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        solve(k, n, 1, output, ans);

        return ans;
    }
}
