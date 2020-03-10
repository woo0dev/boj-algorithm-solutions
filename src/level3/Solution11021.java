package level3;

import java.io.*;
import java.util.StringTokenizer;

public class Solution11021 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int res = 0;

        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            String s = br.readLine();
            StringTokenizer sToken = new StringTokenizer(s);
            int a = Integer.parseInt(sToken.nextToken());
            int b = Integer.parseInt(sToken.nextToken());
            res = a + b;
            bw.write("Case #" + i + ": " + res + "\n");
        }
        bw.flush();
        bw.close();
    }
}
