import java.util.*;
class q7 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter The Word");
            String s = sc.next();

            int l = s.length();
            char ch;
            String a = "";

            for (int i=0;i<l;i++) {
                ch = s.charAt(i);
                if (ch != ' ') {
                    a = a + ch;
                }
                s = s.replace(ch,' ');
            }

            System.out.println("The Word After Removal Of Duplicate Words : "+a);
        }        
    }
}
