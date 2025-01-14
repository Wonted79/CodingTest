package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Baek10807{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =0;i<n;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        int k = Integer.parseInt(br.readLine());
        for(int parseNum : list){
            if (parseNum == k){
                result++;
            }
        }
        System.out.println(result);
        br.close();
    }
}
