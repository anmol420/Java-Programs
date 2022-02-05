import java.util.*;
class q4 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter A String");
            String s = sc.nextLine();
            s = s.toLowerCase();
            int l = s.length();

            String sort = "";
            for (char c='a';c<='z';c++) {
                for (int i=0;i<l;i++) {
                    char ch = s.charAt(i);
                    if (c == ch) {
                        sort += c; 
                    }
                }
            }
            System.out.println("String In Alphabetical Order:\n"+sort);
        }
    }
}