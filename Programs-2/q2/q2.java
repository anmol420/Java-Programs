import java.util.*;

class q2 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter A Word");
            String st = sc.next();
            st = st.toLowerCase();
            System.out.println("The Word To Be Checked Is - " + st);
            int n = st.length();
            String str = "";
            for (int i = n - 1; i >= 0; i--) {
                str = str + st.charAt(i);
            }
            if (st.equalsIgnoreCase(str)) {
                System.out.println("The string is palindrome.");
            } else {
                System.out.println("The string is not palindrome.");
            }
        }
    }
}