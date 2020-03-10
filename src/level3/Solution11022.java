package level3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution11022 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int res = 0;

        for (int i = 1; i <= num; i++) {
            String s = br.readLine();
            StringTokenizer sToken = new StringTokenizer(s);
            int a = Integer.parseInt(sToken.nextToken());
            int b = Integer.parseInt(sToken.nextToken());
            if (0 < a && a < 10 && 0 < b && b < 10) {
                res = a + b;
                bw.write("Case #" + i + ":" + a + " + " + b + " = " + res + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
