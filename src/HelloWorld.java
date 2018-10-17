//: object/ShowProperties.java

import java.util.ArrayList;
public class HelloWorld {
    private static ArrayList<Integer> fibonacci(int index){
        int i = 0;
        Integer previousFibonacci = 0;
        Integer currentFibonacci = 1;
        ArrayList<Integer> sequence = new ArrayList<Integer>();

        while(i < index){
            sequence.add(currentFibonacci);
            int holdPrevious = previousFibonacci;
            previousFibonacci = currentFibonacci;
            currentFibonacci = currentFibonacci + holdPrevious;
            i++;
        }

        return sequence;
    }

    public static void main(String[] args) {
        System.out.println(HelloWorld.fibonacci(7));
    }
} ///:~