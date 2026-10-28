class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> closeToOpen = new HashMap<>();
        Stack<Character> st = new Stack<>();

        closeToOpen.put(')', '(');
        closeToOpen.put('}', '{');
        closeToOpen.put(']', '[');

        for(char c : s.toCharArray()){
            if(closeToOpen.containsKey(c)){
                if(!st.isEmpty() && closeToOpen.get(c) == st.peek()){
                    st.pop();
                }else return false;
            }else {
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
