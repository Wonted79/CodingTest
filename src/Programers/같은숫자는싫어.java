package Programers;
import java.util.*;
public class 같은숫자는싫어 {
    public static int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        for(int num : arr) {
            if (stack.isEmpty() || stack.peek() !=num) {
                stack.push(num);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{4,4,4,3,3})));
    }
}


