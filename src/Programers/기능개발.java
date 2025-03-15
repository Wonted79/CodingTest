package Programers;

import java.util.*;

public class 기능개발 {

    public static List<Integer>  solution(int[] progresses ,int[] speeds) {

        Queue<Integer> q = new LinkedList<Integer>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int num = (100-progresses[i]+speeds[i]-1)/speeds[i];
            q.offer(num);
        }

        int currentMax = q.poll();
        int count = 1;

        while (!q.isEmpty()) {
            int day = q.poll();
            if (day <= currentMax) {
                count++;
            } else {
                res.add(count);
                count = 1;
                currentMax = day;
            }
        }
        res.add(count);

        return res;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{93, 30, 55},new int[]{1, 30, 5}));
        System.out.println(solution(new int[]{95, 90, 99, 99, 80, 99},new int[]{1, 1, 1, 1, 1, 1}));

    }

}
