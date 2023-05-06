package CodeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Scramblies {
    public static void main(String[] args) {
        String str1 = "scriptingjava";
        String str2 = "javascript";
        List<String> list1 = Arrays.stream(str1.split("")).collect(Collectors.toList());
        List<String> list2 = Arrays.stream(str2.split("")).collect(Collectors.toList());
        for (String elem1 : list1) {
            for (int i = 0; i < list2.size(); i++){
                if(elem1.equals(list2.get(i))) {
                    list2.remove(i);
                    break;
                }
            }
        }
        if (list2.isEmpty()) System.out.println("Строка 1 полностью содержит буквы в строке 2");
        else System.out.println("Строка 1 не содержит буквы в строке 2");
    }
}
