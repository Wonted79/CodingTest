package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baek10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st1.nextToken());
        int X = Integer.parseInt(st1.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i =0; i<N;i++){
            list.add(Integer.parseInt(st2.nextToken()));
        }
        for(int parseNum : list){
            if (parseNum < X){
                System.out.print(parseNum+" ");
            }
        }

    }
}
