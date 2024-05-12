package Task_4;

import java.util.Stack;

class StackExample {
    private Stack<Integer> stack;

    public StackExample() {
        stack = new Stack<>();
    }

   
    public void pushElement(int element) {
        stack.push(element);
    }

    public Integer popElement() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }

    
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    
    public void printStack() {
        System.out.println("Stack elements:");
        for (Integer element : stack) {
            System.out.println(element);
        }
    }
}
