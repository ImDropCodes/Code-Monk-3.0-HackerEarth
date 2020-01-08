package DataStructure.Stack;

// Stack Class
class Stack {
    int size;
    int top = -1;
    char[] stack;

    public Stack(int size) {
        this.size = size;
        stack = new char[size];
        top = -1;
    }

    public void push(char ele) {
        if (!isFull()) {
            top++;
            stack[top] = ele;
        }
    }

    public char pop() {
        return stack[top--];
    }

    public boolean isFull() {
        if (top == stack.length - 1) {
            return true;
        }
        return false;
    }
}
