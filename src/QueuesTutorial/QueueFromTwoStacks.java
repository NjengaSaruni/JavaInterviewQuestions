package QueuesTutorial;

import java.util.Stack;

public class QueueFromTwoStacks {
    private Stack<Integer> enqueueStack = new Stack<>();
    private Stack<Integer> dequeueStack = new Stack<>();

    public void enqueue(int value){
        this.enqueueStack.push(value);
    }

    public int dequeue(){
        if(dequeueStack.isEmpty()){
            while(!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }
        return dequeueStack.pop();
    }

    public static void main(String[] args){
        QueueFromTwoStacks queue = new QueueFromTwoStacks();
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(7);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
