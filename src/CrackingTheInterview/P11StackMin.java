package CrackingTheInterview;

import java.util.Stack;

public class P11StackMin{
    public static void main(String[] args){
        StackWithMin stack =  new StackWithMin();
        stack.push(7);
        stack.push(3);
        stack.push(5);
        System.out.println(stack.min());
    }
}

class StackWithMin extends Stack<StackMinNode> {
    public void push(int val){
        int currentMin = Math.min(this.min(), val);
        StackMinNode node = new StackMinNode(val, currentMin);
        super.push(node);
    }

    public int min() {
        if (this.isEmpty()) {

            return Integer.MAX_VALUE;
        } else {

            return peek().min;
        }
    }
}
class StackMinNode {
    int val;
    int min;
    StackMinNode(int val, int min){
        this.val = val;
        this.min = min;
    }
}