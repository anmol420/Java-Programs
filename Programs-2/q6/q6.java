import java.util.*;
class l_u {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter A Sentence");
            String s = sc.nextLine();
            String st = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isLowerCase(ch)) {
                    st = st + (Character.toUpperCase(ch));
                } else if (Character.isUpperCase(ch)) {
                    st = st + (Character.toLowerCase(ch));
                } else {
                    st = st + ch;
                }
            }
            System.out.println("Sentence After Case Inverse - ");
            System.out.println();
            System.out.println(st);
        }
    }
}