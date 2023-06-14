package CodeWars;

public class MergedStringChecker {
    public static void main(String[] args) {
        String s = "codewars";
        String part2 = "code";
        String part1 = "wars";
        String text = "";

        for (String elem : s.split("")) {
            boolean flag = true;
            for (String val1 : part1.split("")) {
                if (elem.equals(val1)) {
                    part1 = part1.substring(1);
                    text += elem;
                    flag = false;
                    break;
                } else break;
            }
            if(flag){
                for (String val2 : part2.split("")) {
                    if (elem.equals(val2)) {
                        part2 = part2.substring(1);
                        text += elem;
                        break;
                    } else break;
                }
            }
        }
        if (s.equals(text)) System.out.println("хорошо");
        else System.out.println("Плохо");
        System.out.println(s);
        System.out.println(text);
    }
}
