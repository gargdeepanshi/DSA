package pepcoding;

import java.util.Arrays;
import java.util.Scanner;

public class MaxScore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            long arr[][] = new long[n][n];
            int flag = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = s.nextInt();

                }
                Arrays.sort(arr[i]);
            }
            long sum = arr[n - 1][n - 1];
            for (int i = n - 2; i >= 0; i--) {
                flag=0;
                for (int j = n - 1; j >= 0; j--) {
                    if (arr[i][j] < arr[i + 1][n - 1]) {
                        sum = sum + arr[i][j];
                        arr[i][n - 1] = arr[i][j];
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    sum = -1;
                    break;
                }

            }
            System.out.println(sum);

        }
    }
}
