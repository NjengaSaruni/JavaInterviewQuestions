/*Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

        Note: You may not slant the container and n is at least 2.





        The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.



        Example:

        Input: [1,8,6,2,5,4,8,3,7]
        Output: 49

        Thought process: brute force

        */
package LeetCode.Medium;

public class Medium11MaxArea {

    public static int maxArea(int[] height) {
        int max = Math.min(height[0], height[1]);
        for(int i = 0; i < height.length - 1; i ++){
            int j = i + 1;
            int curmax = 0;

            while( j < height.length){
                if(height[i] <= height[j]){
                    curmax = Math.max(curmax, height[i] * (j - i));
                }else {
                    curmax = Math.max(curmax, height[j] * (j - i));
                }
                j++;
            }
            max = Math.max(curmax, max);
        }
        return max;
    }

    public static void main(String[] args){
        int[] array =  new int[]{1, 1};

        System.out.println(maxArea(array));
    }
}
