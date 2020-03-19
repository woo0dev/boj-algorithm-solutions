package level4;

import java.io.*;
import java.util.StringTokenizer;

public class Solution10952 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int end1 = 1;
        int end2 = 1;

        while (end1 != 0 && end2 != 0) {
            String s = br.readLine();
            StringTokenizer sToken = new StringTokenizer(s);
            int a = Integer.parseInt(sToken.nextToken());
            int b = Integer.parseInt(sToken.nextToken());
            if (a == 0 && b == 0) {
                break;
            }
            int res = a + b;
            bw.write(res + "\n");
        }

        bw.flush();
        bw.close();


    }
}
