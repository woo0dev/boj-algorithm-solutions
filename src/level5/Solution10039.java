package level5;

import java.io.*;

public class Solution10039 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] stu = new int[5];

        int sum = 0;
        int avg = 0;

        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            stu[i] = Integer.parseInt(s);
        }
        for (int i = 0; i < 5; i++) {
            if (stu[i] < 40) {
                stu[i] = 40;
            }
        }
        for (int i = 0; i < 5; i++) {
            sum += stu[i];
        }
        avg = sum / 5;
        bw.write(avg + "\n");
        bw.flush();
        bw.close();

    }
}
