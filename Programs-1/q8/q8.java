import java.util.Scanner;
class q8 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Number Of Terms");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Invalid Input! n should be greater than 0.");
                return;
            }

            int arr[] = new int[n];
            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int t = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = t;
                    }
                }
            }

            int endIdx = n - 1;
            int startIdx;

            if (n % 2 == 0) {
                startIdx = n - 1;
            } else {
                startIdx = n - 2;
            }

            while (startIdx > 0) {
                int t = arr[startIdx];
                int idx = startIdx;

                while (idx != endIdx) {
                    arr[idx] = arr[idx + 1];
                    idx++;
                }

                arr[idx] = t;
                startIdx -= 2;
                endIdx -= 1;
            }

            for (int i = 0, j = (n - 1) / 2; i < j; i++, j--) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}