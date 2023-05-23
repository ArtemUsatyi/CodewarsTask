package CodeWars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedListNames {
    public static void main(String[] args) {
        String names = "Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn";
        List<String> list = new ArrayList<>();
        for (String elem : names.split(";")) {

            String[] twoName = elem.split(":");
            list.add("(" + twoName[1].toUpperCase() + "," + twoName[0].toUpperCase() + ")");
        }
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
    }
}
