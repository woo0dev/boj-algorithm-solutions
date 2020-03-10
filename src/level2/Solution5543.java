package level2;

import java.util.Scanner;

public class Solution5543 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int res = 0, min = 0, input;

        min = scanner.nextInt();

        for (int i = 0; i < 2; i++) {
            input = scanner.nextInt();
            if (min > input) {
                min = input;
            }
        }

        res += min;

        min = scanner.nextInt();
        for (int i = 0; i < 1; i++){
            input = scanner.nextInt();
            if (min > input){
                min = input;
            }
        }

        res += min - 50;

        System.out.println(res);


    }
}
