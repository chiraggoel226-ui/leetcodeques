
class BrowserHistory {

    Deque<String> currst;
    Deque<String> forst;

    public BrowserHistory(String homepage) {
        currst = new ArrayDeque<>();
        forst = new ArrayDeque<>();

        currst.push(homepage);
    }

    public void visit(String url) {
        currst.push(url);

        forst.clear();
    }

    public String back(int steps) {

        while (steps-- > 0) {
            if (currst.size() > 1) {
                forst.push(currst.pop());
            } else {
                break;
            }
        }

        return currst.peek();
    }

    public String forward(int steps) {

        while (steps-- > 0) {
            if (!forst.isEmpty()) {
                currst.push(forst.pop());
            } else {
                break;
            }
        }

        return currst.peek();
    }
}
