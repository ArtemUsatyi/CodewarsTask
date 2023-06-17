package CodeWars;

public class MergedStringChecker {
    public static void main(String[] args) {
        String s = "+]Ekbb)3Y%.>i/l>>Su[,E.I'+k";
        String part1 = "bb3>i/l[,I+k";
        String part2 = "+]Ek)Y%.>>SuE.'";
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
    }
}
