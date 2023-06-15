package CodeWars;

import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flo", "floght", "flog"};
        int prefix = 0;
        String shortest = Arrays.stream(strs).min((e2, e1) -> e1.length() > e2.length() ? -1 : 1).get();
        boolean flag = false;
        for (int i = 0; i < shortest.length(); i++) {
            char current = shortest.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != current) flag = true;
            }
            if (flag) break;
            prefix++;
        }
        System.out.println(shortest.substring(0, prefix));
    }
}
