package level3;


import java.io.*;
import java.util.StringTokenizer;

public class Solution15552 {
    public static void main(String args[]) throws IOException {
        BufferedReader bfreader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfwriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(bfreader.readLine());

//        String s = bfreader.readLine();
//        StringTokenizer sToken = new StringTokenizer(s);

        if (t <= 1000000) {
            for (int i = 0; i < t; i++) {
                String s = bfreader.readLine();
                StringTokenizer sToken = new StringTokenizer(s);
                int a = Integer.parseInt(sToken.nextToken());
                int b = Integer.parseInt(sToken.nextToken());
                bfwriter.write(a+b+"\n");
            }
        }
        bfwriter.flush();
        bfwriter.close();
    }
}
