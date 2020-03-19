package level5;

import java.io.*;

public class Solution2446 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int val = Integer.parseInt(s);
        int val2 = val;
        int a = 3;

        for (int i = 0; i < val; i++) {
            for (int j = 0; j < i; j++) {
                bw.write(" ");
            }
            for (int k = val2*2-1; k > 0; k--) {
                bw.write("*");
            }
            bw.write("\n");
            val2--;
        }
        for (int i = 0; i < val-1; i++) {
            for (int j = val-2; j > i; j--) {
                bw.write(" ");
            }
            for (int k = 0; k < a; k++) {
                bw.write("*");
                if (k > val*2) {
                    break;
                }
            }
            a += 2;
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
