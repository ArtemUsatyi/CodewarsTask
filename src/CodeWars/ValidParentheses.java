package CodeWars;

import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        Map<String, String> mapChar = new HashMap<>();
        mapChar.put("(", ")");
        mapChar.put("[", "]");
        mapChar.put("{", "}");
        String s = "(}";
        LinkedList<String> test = new LinkedList<>();
        // надо добавлять сначала строки, а потом их удалять с очереди 1->2->3 ; 1<-2<-3

        for (String elem : s.split("")) {
            if (mapChar.containsKey(elem)) test.push(elem);
            else if (mapChar.containsValue(elem)) {
                if (test.isEmpty() || mapChar.get(test.get(0)).equals(elem)) test.pop();
            }
        }
        System.out.println(test.isEmpty() ? "Валидно" : "Не валидно");
    }
}
