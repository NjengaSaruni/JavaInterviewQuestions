package Stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CustomStack {
    List<Integer> stack = new ArrayList<>();
    Stack<Integer> mins = new Stack<>();
    int head;

    public void push(Integer value){
        stack.add(value);
        if(!mins.isEmpty()){
            if((int)value <= this.mins.peek()) mins.push(value);
        }else {
            mins.push(value);
        }
        head+=1;
    }

    public int getMin(){
        return this.mins.peek();
    }

    public Integer pop(){
        if(stack.get(head) == mins.peek()){
            mins.pop();
        }
        this.head -= 1;
        return stack.get(head   -1);
    }

    public Integer peek(){
        return stack.get(head);
    }

    public static void main(String[] args){
        CustomStack stack = new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(-1);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());

    }

}
