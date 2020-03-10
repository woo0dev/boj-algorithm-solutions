package level3;

import java.io.*;

public class Solution2742 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        if (0 <= num && num <= 100000) {
            for (int i = num; i >= 1; i--) {
                bw.write(i+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
