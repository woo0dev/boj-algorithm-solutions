package level5;

import java.io.*;
import java.util.StringTokenizer;

public class Solution2523 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer sToken = new StringTokenizer(s);

        int val = Integer.parseInt(sToken.nextToken());

        for (int i = 0; i < val; i++) {
            for (int j = 0; j <= i; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        for (int i = 1; i < val; i++) {
            for (int j = val; j > i; j--) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
