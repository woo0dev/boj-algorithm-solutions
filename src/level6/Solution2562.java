package level6;

import java.io.*;

public class Solution2562 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int max = 0, index = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] >= 100) break;
        }
        max = arr[0];
        for (int i = 1; i < 9; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i+1;
            }
        }
        bw.write(max + "\n" + index);
        bw.flush();
        bw.close();
    }
}
