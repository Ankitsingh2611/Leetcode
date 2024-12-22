class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
         List<Integer> result = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                List<Integer> leftResults = diffWaysToCompute(left);
                List<Integer> rightResults = diffWaysToCompute(right);
                for (int leftResult : leftResults) {
                    for (int rightResult : rightResults) {
                        int computeResult = compute(leftResult, rightResult, c);
                        result.add(computeResult);
                    }
                }
            }
        }
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        return result;
    }

    private int compute(int a, int b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            default:
                throw new RuntimeException("Invalid operator");
        }
    }
}