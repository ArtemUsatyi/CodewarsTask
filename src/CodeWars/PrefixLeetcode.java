package CodeWars;

import java.util.Arrays;

public class PrefixLeetcode {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight", "y"};
        int prefix = 0;
        String shortest = Arrays.stream(strs).min((e2, e1) -> e1.length() > e2.length() ? -1 : 1).get();
        boolean flag = false;

        for (int i = 0; i < shortest.length(); i++) {

            for (String str : strs) {
                if (str.charAt(i) == shortest.charAt(i)) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) prefix++;
            else break;
        }

        System.out.println(shortest.substring(0,prefix));
//        Алтенативное решение
//        if (strs == null || strs.length == 0) return "";
//        String prefix = strs[0];
//        for (String s : strs)
//            while (s.indexOf(prefix) != 0)
//                prefix = prefix.substring(0, prefix.length() - 1);
//        return prefix;

    }
}
