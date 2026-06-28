class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for (String token : tokens) {
            switch (token) {
                case "+" -> st.push(st.pop() + st.pop());
                case "-" -> {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b - a);
                }
                case "*" -> st.push(st.pop() * st.pop());
                case "/" -> {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b / a);
                }
                default -> st.push(Integer.parseInt(token));
            }
        }
        return st.peek();
    }
}
