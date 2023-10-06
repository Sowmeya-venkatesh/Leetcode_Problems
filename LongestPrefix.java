import java.util.*;
import java.lang.String;

public class LongestPrefix {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n;
            System.out.println("How many elements do you want to add");
            n = scan.nextInt();
            System.out.println("Enter the elements \n");
            String[] a = new String[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.next();
            }
            Arrays.sort(a);
            String s1 = a[0], s2 = a[n - 1];
            int val = 0;
            while (val < s1.length() && val < s2.length()) {
                if (s1.charAt(val) == s2.charAt(val)) {
                    val++;
                } else {
                    break;
                }
            }
            System.out.println("The longest prefix is " + s1.substring(0, val));

        }
    }
}
