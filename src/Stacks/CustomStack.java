package Stacks;

import java.util.ArrayList;
import java.util.List;

public class CustomStack {
    List<Object> stack = new ArrayList<>();
    int head;

    public void push(Object value){
        stack.add(value);
    }

    public Object pop(){
        this.head += 1;
        return stack.get(head - 1);
    }

    public Object peek(){
        return stack.get(head);
    }

    public static void main(String[] args){
        CustomStack stack = new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
