import java.util.*;
class q5 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter A Number");
            int n = sc.nextInt();

            if (n < 100) {
                System.out.println("Not A Bounty Number");
                return;
            }

            int t = n;
            boolean Increasing = true, Decreasing = true;

            int p = t % 10;
            while (t != 0) {
                int d = t % 10;
                if (d > p) {
                    Increasing = false;
                    break;
                }
                p = d;
                t /= 10;
            }

            t = n;
            int f = t % 10;
            while (t != 0) {
                int d = t % 10;
                if (d < f) {
                    Decreasing = false;
                    break;
                }
                f = d;
                t /= 10;
            }

            if (!Increasing && !Decreasing)
                System.out.println(n + " is a Bouncy Number.");
            else
                System.out.println(n + " is not a Bouncy Number.");
        }
    }
}