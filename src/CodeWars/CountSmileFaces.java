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
            if (elem.matches("[:;][-~]?[)D]")) count++;
        }
        System.out.println(count);
        // Алтернативная версия
       // (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
    }
}
