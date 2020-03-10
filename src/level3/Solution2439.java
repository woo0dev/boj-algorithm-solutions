package level3;

import java.io.*;

public class Solution2439 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        if (1 <= num && num <= 100) {
            for (int i = 1; i <= num; i++) {
                for (int j = num-1; j >= i; j--) {
                    bw.write(" ");
                }
                for (int k = 1; k <= i; k++) {
                    bw.write("*");
                }
                bw.write("\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
