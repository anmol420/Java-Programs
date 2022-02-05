import java.util.*;
class q10 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Value Of m");
            int m = sc.nextInt();
            System.out.println("Enter The Value Of n");
            int n = sc.nextInt();

            int a[][] = new int[m][n];
            int r = 0, c = 0;
            int total = m * n;
            int count = 0;
            for (int i = 2; count < total; i++) {

                int div = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        div++;
                    }
                }

                if (div == 2) {
                    a[r][c++] = i;
                    count++;
                    if (c == n) {
                        r++;
                        c = 0;
                    }
                }

            }

            System.out.println("Prime Numbers Array:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}