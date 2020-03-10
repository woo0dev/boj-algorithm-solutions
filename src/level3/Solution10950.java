package level3;

import java.util.Scanner;

public class Solution10950 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (0 < a && a < 10 && 0 < b && b < 10) {
                System.out.println(a + b);
            }
        }
    }
}
