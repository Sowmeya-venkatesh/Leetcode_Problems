import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            Boolean x;
            int num;
            num = scan.nextInt();
            x = isPalindrom(num);
            if (x == true) {
                System.out.println("Number is palindrome");
            } else {
                System.out.println("Number is not palindrome");
            }
        }
    }

    private static Boolean isPalindrom(int num) {
        int x = num, r = 0;
        if (num < 0) {
            return false;
        }
        while (x > 0) {
            r = (r * 10) + x % 10;
            x /= 10;
        }
        if (r == num) {
            return true;
        }
        return false;
    }
}
