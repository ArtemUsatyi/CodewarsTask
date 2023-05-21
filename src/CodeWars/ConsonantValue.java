package CodeWars;


public class ConsonantValue {
    public static void main(String[] args) {
        String str = "strength";
        String[] text = str.split("[aeiou]");
        int value = 0;
        for (String group : text) {
            int count = 0;
            for (String elem : group.split("")) {
                if (!elem.matches("[aeiou]") && !elem.isEmpty()) {
                    count += (int) elem.charAt(0) - 96;
                }
            }
            if (count > value) value = count;
        }
        System.out.println(value);

        // Альтернативный вариант
        // of(s.split("[aeiou]")).mapToInt(con -> con.chars().map(c -> c - 96).sum()).max().orElse(0);
    }
}
