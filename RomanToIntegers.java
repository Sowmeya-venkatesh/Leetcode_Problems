import java.util.*;

public class RomanToIntegers {
    public static void main(String[] args) {
        String num;
        int x;
        try (Scanner scan = new Scanner(System.in)) {

            num = scan.next();
            x = roman(num);
            System.out.println("The number is " + x);
        }
    }

    private static int roman(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                res -= m.get(s.charAt(i));
            } else {
                res += m.get(s.charAt(i));
            }
        }
        return res;
    }
}
