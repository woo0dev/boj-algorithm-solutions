package level3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution10871 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer sToken = new StringTokenizer(s);

        int n = Integer.parseInt(sToken.nextToken());
        int x = Integer.parseInt(sToken.nextToken());

        String s2 = br.readLine();
        String arr[] = s2.split(" ");
        int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < n; i++) {
                if (nums[i] < x) {
                    bw.write(nums[i] + " ");
                }
        }
        bw.flush();
        bw.close();
    }
}
