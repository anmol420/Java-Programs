import java.util.*;
class q3 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter A Sentence");
            String st = sc.nextLine();

            st = st + " ";
            int l = st.length();
            String w = "";
            for (int i=0;i<=l-1;i++) {
                char ch = st.charAt(i);
                if (ch != ' ') {
                    if (ch == 'a') {
                        w = w + "an";
                    } else {
                        w = w + ch;
                    }
                } else {
                    System.out.print(w+" ");
                    w = "";
                }
            }
        }
    }
}