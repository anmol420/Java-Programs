//refer q1.txt

import java.util.*;
class q1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        //accepting a number from the user
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        System.out.println();

        //checking the eligibility of the number
        if (n<100 || n>999) {
            System.out.println("Invalid Number");
            return;
        }

        //checking if any digit is 0
        int d[] = new int[3];
        int n1=n;
        int c=2;
        while (n1 != 0) {
            int k = n1%10;
            if (k==0) {
                System.out.println("Invalid Number");
                return;
            }
            d[c--]= k;
            n1/=10;
        }

        //printing the combinations
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                for (int k=0;k<3;k++) {
                    if (i != j  && j != k && i != k) {
                        System.out.println(d[i]+""+d[j]+""+d[k]);
                    }
                }
            }
        }
    }
}