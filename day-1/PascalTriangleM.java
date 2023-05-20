//using memorization

import java.util.HashMap;
import java.util.Map;

public class PascalTriangleM {
    private static Map<String, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int rows = 4;
        System.out.println("Pascal Triangle:");
        print(rows);
    }

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int pascal(int i, int j) {
        String key = i + "_" + j;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int value;
        if (j == 0 || j == i) {
            value = 1;
        } else {
            value = pascal(i - 1, j - 1) + pascal(i - 1, j);
        }

        memo.put(key, value);
        return value;
    }
}
