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

    private static int vampireNumbers(){
        int limit = 10000;
        int sqrt = 100;

        for(int i = 0; i < limit; i++){
            int lhs = i / sqrt;
            int lhsi = (lhs % 10) * 10 + (lhs / 10);
            int rhs = i % sqrt;
            int rhsi = (rhs % 10) * 10 + (rhs / 10);
            String output = String.format("%d: %d %d %d %d", i, lhs, lhsi, rhs, rhsi);
            System.out.println(output);


            if(lhs * rhs  == i) {
                System.out.println("Found");
                System.out.println(lhs);
                System.out.println(rhs);
            }
            if(lhs * rhsi == i){
                System.out.println("Found");
                System.out.println(lhs);
                System.out.println(rhsi);
            }
            if(lhsi * rhs == i) {
                System.out.println("Found");
                System.out.println(lhsi);
                System.out.println(rhs);
            }if(lhsi * rhsi == i){
                System.out.println("Found");
                System.out.println(lhsi);
                System.out.println(rhsi);
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        ArrayTrial trial = new ArrayTrial("This is the name");
    }

    private static class ArrayTrial {
        ArrayTrial(String trialName){
            System.out.print(trialName);
        }
    }
} ///:~