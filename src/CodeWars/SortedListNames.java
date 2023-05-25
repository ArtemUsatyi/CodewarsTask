package CodeWars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedListNames {
    public static void main(String[] args) {
        String names = "Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn";
        List<String> list = new ArrayList<>();
        for (String elem : names.split(";")) {
            String[] twoName = elem.split(":");
            list.add("(" + twoName[1].toUpperCase() + "," + twoName[0].toUpperCase() + ")");
            Collections.sort(list);
        }
        String text = "";
        for (String elem : list) text += elem;
        System.out.println(text);

        // Альтернативная версия
        //Arrays.stream(s.toUpperCase().split(";"))
        //                   .map(guest -> guest.replaceAll("(\\w+):(\\w+)", "($2, $1)"))
        //                   .sorted()
        //                   .collect(Collectors.joining(""));
    }
}
