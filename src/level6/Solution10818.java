package level6;

import java.io.*;
import java.util.StringTokenizer;

public class Solution10818 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int a = Integer.parseInt(s);
        StringTokenizer sToken = new StringTokenizer(br.readLine());
        int max = -1000000;
        int min = 1000000;
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(sToken.nextToken());
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}
