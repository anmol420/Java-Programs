import java.util.*;
class q7 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter A String");
            String s = sc.next();
            System.out.println("Enter Another String");
            String st = sc.next();

            String newString = "";
            int len = s.length();

            for (int i=0;i<len;i++) {
                char c = s.charAt(i);
                char ch = st.charAt(len - 1 -i);
                newString =  newString + c + ch;
            }

            System.out.println("Output :\n"+newString);
        }
    }
}