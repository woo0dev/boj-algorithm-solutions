package level5;

import java.io.*;

public class Solution10996 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int val = Integer.parseInt(s);

        for (int i = 0; i < val; i++) {
            for (int j = 0; j < val; j++) {
                if (j % 2 == 0) {
                    bw.write("*");
                } else
                    bw.write(" ");
            }
            bw.write("\n");
            for (int k = 0; k < val; k++) {
                if (k % 2 == 0) {
                    bw.write(" ");
                } else
                    bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
