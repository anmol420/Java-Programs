import java.util.*;
class q8 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter A Sentence");
            String str = sc.nextLine();
            char[] arr = str.toCharArray();
            arr[0] = 'X';
            int i = 0;
            while (i < arr.length) {
                if (arr[i] == ' ') {
                    arr[i + 1] = 'X';
                }
                 i++;
            }
            String x = "";
            for (char c : arr) {
                x = x + c;
            }
            System.out.println(x);
        }
    }
}