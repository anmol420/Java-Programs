import java.util.*;
class q10 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter A Three Letter Word");
            String st = sc.next();
            int len = st.length();

            if (len != 3) {
                System.out.println("Invalid Input !! The Word Must Of 3 Letters Only");
                return;
            }

            for (int i=0;i<len;i++) {
                for (int j=0;j<len;j++) {
                    for (int k=0;k<len;k++) {
                        if (i!=j && i!=k && k!=j) {
                            System.out.print(st.charAt(i));
                            System.out.print(st.charAt(j));
                            System.out.println(st.charAt(k));
                        }
                    }
                }
            }
        }
    }
}