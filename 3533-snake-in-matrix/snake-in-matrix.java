class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {

        int ans = 0;

        for (String command : commands) {

            if (command.equals("UP")) {
                ans -= n;
            }
            else if (command.equals("DOWN")) {
                ans += n;
            }
            else if (command.equals("RIGHT")) {
                ans += 1;
            }
            else if (command.equals("LEFT")) {
                ans -= 1;
            }
        }

        return ans;
    }
}