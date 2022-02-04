//refer to q3.java

import java.util.*;
class q3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        //accepting the value of M from user
        System.out.println("Enter The Value Of M :");
        int M = sc.nextInt();

        //accepting the value of N from user
        System.out.println("Enter The Value Of N :");
        int N = sc.nextInt();

        //checking eligibility
        if (M < 100 || M > 10000) {
            System.out.println("The Value Of M Must Be Between 100 And 10000");
            return;
        }
        
        if (N > 100) {
            System.out.println("The Value Of N Must Be Less Than 100");
            return;
        }

        //main code
        int no = -1, c = 0;
        for (int i = M + 1; i < Integer.MAX_VALUE; i++) {
            int sum = 0;
            c = 0;
            int t = i;
            while (t != 0) {
                int d = t % 10;
                sum += d;
                t /= 10;
                c++;
            }

            if (sum == M) {
                no = i;
                break;
            }
        }

        if (no == -1) {
            System.out.println("Required number not found");
        }
        else {
            System.out.println("The required number = " + no);
            System.out.println("Total number of digits = " + c);
        }
    }
}