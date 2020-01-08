package DataStructure.Stack;

// Stack Class
class Stack_int {
    int size;
    int top = -1;
    int[] stack;

    public Stack_int(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int ele) {
        if (!isFull()) {
            top++;
            stack[top] = ele;
        }
    }

    public int pop() {
        return stack[top--];
    }

    public boolean isFull() {
        if (top == stack.length - 1) {
            return true;
        }
        return false;
    }
}
