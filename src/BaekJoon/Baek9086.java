package BaekJoon;

import javax.lang.model.type.ArrayType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baek9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String  st = br.readLine();
            list.add(st.charAt(0)+st.substring(st.length()-1));
        }
        for (String st : list) {
            System.out.println(st);
        }
    }
}
