import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        s1 = s1.toLowerCase();
        char[] s2 = s1.toCharArray();
        int x = s1.length() - 1;
        int i;
        for (i = 0; i < x; i++, x--) {
            if (s2[i] != s2[x]) {
                System.out.println("Your word isn't a Palindrome");
                break;
            }
        }
        if (i >= x && i != 0) {
            System.out.println("Your word is a Palindrome");
        }
    }
}
