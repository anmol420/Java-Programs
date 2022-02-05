import java.util.*;
class q5 {
    static int find_str (String st,String search) {
        int i;
        int f=0;

        String s[] = st.split(" ");
        for (i=0;i<s.length;i++) {
            if (search.equals(s[i])) {
                f = f+1;
            }
        }
        return f;
    }
    public static void main (String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter A Sentence");
            String s = sc.nextLine();
            System.out.println("Enter The Word To Be Searched");
            String st = sc.next();

            st = st.toLowerCase();
            s = s.toLowerCase();

            int x = find_str(s, st);

            if (x == 0) {
                System.out.println("Word Not Found");
            } else {
                System.out.println("Word Is Present In The Sentence "+x+" times");
            }
        }
    }
}