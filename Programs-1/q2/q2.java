//refer q2.txt

import java.util.*;
class q2 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        //accepting a number from the user
        System.out.println("Enter The Number :");
        int n = sc.nextInt();

        //checking the eligibility of the number
        if (n<3) {
            System.out.println("The Number Should Be Greater Than 3");
            return;
        }

        //printing the output
        System.out.println("Triangular Numbers from 3 to "+n+" :");
        int sum = 3;
        for (int i=3;sum<=n;i++) {
            System.out.println(sum);
            sum += i;
        }
    }
}