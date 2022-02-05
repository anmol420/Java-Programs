import java.util.*;
class q9 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Value Of m");
            int m = sc.nextInt();
            System.out.println("Enter The Value Of n");
            int n = sc.nextInt();

            int a[][] = new int[m][n];
            int newArr[][] = new int[m][n];

            System.out.println("Enter array elements");
            for (int i = 0; i < m; i++) {
                System.out.println("Enter Row " + (i + 1) + " :");
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Input Array:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j] + "\t");
                }
                System.out.println();
            }

            for (int j = 0; j < n; j++) {
                int col = j + 1;
                if (col == n) {
                    col = 0;
                }
                for (int i = 0; i < m; i++) {
                    newArr[i][col] = a[i][j];
                }
            }

            System.out.println("New Shifted Array:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(newArr[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}