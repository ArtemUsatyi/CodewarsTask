package CodeWars;

import java.util.Arrays;
import java.util.List;

public class CountSmileFaces {
    public static void main(String[] args) {
        List<String> listSmileFaces = Arrays.asList(":-)", "-(", ";-D", ":-D", ";-(");
        // Смайл должен обязательно иметь
        // ГЛАЗА : ;
        // РОТ ) D
        // НОС (не всегда) - ~
        int count = 0;
        for (String elem : listSmileFaces) {
            if (elem.substring(0, 1).matches("[:;]") && elem.substring(1, 2).matches("[-~]")
                    && elem.substring(2).matches("[)D]")) count++;
            else if (elem.substring(0, 1).matches("[:;]") && elem.substring(1).matches("[)D]")) count++;
        }
        System.out.println(count);
        // Алтернативная версия
       // (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
    }
}
