//refer to q4

import java.util.*;
class q4 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        //accepting number from the user
        System.out.println("Enter The Number To Be Checked");
        int n = sc.nextInt();

        //checking the eligibility
        if (n > 1000 || n < 100) {
            System.out.println("The Number Must Be 3 Digit Only");
            return;
        }

        int n1 = n*2;
        int n2 = n*3;

        String st = n+""+n1+n2;

        boolean found = true;

        for (char c = '1';c<='9';c++) {
            int count = 0;

            for (int i=0;i<st.length();i++) {
                char ch = st.charAt(i);

                if (ch == c) {
                    count++ ;
                }
            }
            if (count>1 || count==0) {
                found = false;
                break;
            }
        }
        if (found) {
            System.out.println(n+" Is A Fascinating Number");
        } else {
            System.out.println(n+" Is Not A Fascinating Number");
        }
    }
}