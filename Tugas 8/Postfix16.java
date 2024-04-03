public class Postfix16 {
    int n;
    char[] stack;
    int top;

    public Postfix16(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean IsOperand(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public boolean IsOperator(char c) {
        return c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+';
    }

    public int precedence(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
            case '/':
            case '*':
                return 2;
            case '-':
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi(String Q) {
        String p = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (IsOperand(c)) {
                p += c;
            } else if (c == '(') {
                push(c);
            } else if (c == ')') {
                while (stack[top] != '(') {
                    p += pop();
                }
                pop();
            } else if (IsOperator(c)) {
                while (top >= 0 && precedence(stack[top]) >= precedence(c)) {
                    p += pop();
                }
                push(c);
            }
        }
        return p;
    }
}
