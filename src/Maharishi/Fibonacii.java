package Maharishi;

// 1. The Fibonacci sequence of numbers is 1, 1, 2, 3, 5, 8, 13, 21, 34
// The first and second numbers are 1 and after that ni = ni-2 + ni-1, e.g., 34 = 13 + 21.
// A number in the sequence is called a Fibonacci number. Write a method
// with signature int closestFibonacci(int n) which returns the largest Fibonacci
// number that is less than or equal to its argument. For example,
// closestFibonacci(12) returns 8 because 8 is the largest Fibonacci number
// less than 12 and closestFibonacci(33) returns 21 because 21 is the largest
// Fibonacci number that is <= 33. closestFibonacci(34) should return 34.
// If the argument is less than 1 return 0. Your solution must not use
// recursion because unless you cache the Fibonacci numbers as you find them,
// the recursive solution recomputes the same Fibonacci number many times.

public class Fibonacii {
    public static int closestFibonacci(int n) {
        int a = 1;
        int b = 1;

        while(b <= n) {
            int hold = b;
            b = a + b;
            a = hold;
        }
        return a;
    }

    public static int computeWeightedSum(int[] a) {
        int ans = 0;
        for(int value: a) {
            if (value % 2 == 0) {
                ans += 2 * value;
            }else {
                ans += 3 * value;
            }
        }
        return ans;
    }

    public static int isTwinPaired(int[] a) {
        int largestEven = Integer.MIN_VALUE;
        int largestOdd = Integer.MIN_VALUE + 1;
        for(int value: a) {
            if (value % 2 == 0) {
                if (value < largestEven) {
                    return 0;
                }
                largestEven = value;
            }
            if (value % 2 != 0) {
                if (value < largestOdd) {
                    return 0;
                }
                largestOdd = value;
            }
        }

        return 1;
    }
    public static void main(String[] args) {
        System.out.println(closestFibonacci(8));
        System.out.println(computeWeightedSum(new int[]{1, 2, 3, 4, 5}));
        System.out.println(isTwinPaired(new int[]{1, 2, 3, 4, 5, 17, 6}));
    }
}
