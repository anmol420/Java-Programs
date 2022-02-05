import java.util.*;

class q6 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter A String");
            String s = sc.next();

            String str = s.toLowerCase();
            int len = str.length();

            String sortedStr = ""; // Empty String
            for (char ch = 'a'; ch <= 'z'; ch++) {
                for (int i = 0; i < len; i++) {
                    char strCh = str.charAt(i);
                    if (ch == strCh) {
                        sortedStr += strCh;
                    }
                }
            }

            System.out.println("Alphabetical order:");
            System.out.println(sortedStr);

            String filledStr = ""; // Empty String
            for (int i = 0; i < len - 1; i++) {
                char strCh = sortedStr.charAt(i);
                filledStr += strCh;
                for (int j = strCh + 1; j < sortedStr.charAt(i + 1); j++) {
                    filledStr += (char) j;
                }
            }
            filledStr += sortedStr.charAt(len - 1);

            System.out.println("Filled String:");
            System.out.println(filledStr);
        }
    }
}