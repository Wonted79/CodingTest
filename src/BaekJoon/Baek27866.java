package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st = new StringBuilder();
        st.append(br.readLine());
        String str = st.toString();
        int n = Integer.parseInt(br.readLine());
        System.out.print(str.charAt(n-1));
    }
}
