
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> st = new ArrayDeque<>();

        for (int ast : asteroids) {

            if (ast >= 0) {
                st.push(ast);
            } 
            else {

                if (st.isEmpty()) {
                    st.push(ast);
                }

                else if (st.peek() < 0) {
                    st.push(ast);
                }

                else {
                    boolean destroyed = false;

                    while (!st.isEmpty() && st.peek() > 0 && ast < 0) {

                        if (st.peek() < -ast) {
                            st.pop();
                            continue;
                        }

                        else if (st.peek() > -ast) {
                            destroyed = true;
                            break;
                        }

                        else {
                            st.pop();
                            destroyed = true;
                            break;
                        }
                    }

                    if (!destroyed) {
                        st.push(ast);
                    }
                }
            }
        }

        int[] ans = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}
