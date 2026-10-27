class Solution {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int n = tokens.length;

        for(int i = 0; i < n; i++){
            String str = tokens[i];
            if (str.matches("-?\\d+")) {
                int number = Integer.parseInt(str);
                stack.push(number);
            }else{
                int x = stack.pop();
                int y = stack.pop();
                int result = 0;

                switch (str) {
                    case "+":
                        result = x + y;
                        break;
                    case "-":
                        result = y-x;
                        break;
                    case "*":
                        result = x * y;
                        break;
                    case "/":
                        if (x == 0) {
                            throw new ArithmeticException("Lỗi: Không thể chia cho 0");
                        }
                        result = y / x;
                        break;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }
}
