package level3;

import java.util.Scanner;

public class Solution8393 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int res = 0;

        if (1 <= num && num <= 10000) {
            for (int i = 1; i <= num; i++) {
                res += i;
            }
            System.out.println(res);
        }
    }
}
