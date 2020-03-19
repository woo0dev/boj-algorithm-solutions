package level4;

import java.io.*;

public class Solution1110 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int val = Integer.parseInt(s);
        int one = val / 10;
        int two = val % 10;
        int sum = 0;
        int onetemp = one;
        int twotemp = two;
        int cycle = 0;

        while (true) {
            cycle++;
            sum = one + two;
            one = two;
            two = sum % 10;
            if (one == onetemp && two == twotemp){
                bw.write(cycle + "\n");
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}
