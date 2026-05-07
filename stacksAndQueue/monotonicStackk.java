package stacksAndQueue;

import java.util.*;

public class monotonicStackk {

    public static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>(); // stack stores the indices

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // while stack is not empty and current element is > stack top
            while (!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int index = stack.pop(); // pop the top element
                result[index] = nums[i]; // current element is NGE
            }
            stack.push(i); // push the current index onto the stack
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = { 2, 1, 5, 6, 2, 3 };
        System.out.println("iiiiiiiiiiiiiii");
        System.out.println(Arrays.toString(nextGreaterElement(input)));
    }
}
