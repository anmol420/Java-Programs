import java.util.*;
class q1 {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter A Character");
            char ch = sc.next().charAt(0);

            if (Character.isLetter(ch)) {
                System.out.println("The Character Is Letter");
            } else if (Character.isDigit(ch)) {
                System.out.println("The Character Is Digit");
            } else {
                System.out.println("The Character Is Special Symbol");
            }
        }
    }
}