import java.util.*;
class q9 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a sentence");
            String s = sc.nextLine();
            s = s + " ";
            int n = s.length();
            String w = "";
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch != ' ') {
                    w = ch + w;
                } else {
                    System.out.print(w + " ");
                    w = "";
                }
            }
        }
    }
}
