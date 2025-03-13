package Programers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {

    public static int[] solution(int[] progresses ,int[] speeds) {

        Queue<Integer> q = new LinkedList<Integer>();
        int max = 0;
        int count =0;
        for (int i = 0; i < progresses.length; i++) {
            int num = 100-progresses[i]/speeds[i];
            q.offer(num);



        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55},new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99},new int[]{1, 1, 1, 1, 1, 1})));

    }

}
