import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 12, 0, 6, 123, 3);

        System.out.println("Промежуточная операция - filter()");
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.println("Четные числа " + i));

        System.out.println("-----------");
        System.out.println("Промежуточная операция - map()");
        numbers.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        List<String> listName = Arrays.asList("kurt", "ivashka", null);
        long count = listName.stream()
                .filter(Objects::nonNull)
                .filter(i -> i.length() > 4)
                .count();
        System.out.println("-----------");
        System.out.println("Терминальная операция - count()");
        System.out.println("Общее количество имен в списке, где длина букв в именах равняется больше 4: " + count);


        System.out.println("-----------");
        System.out.println("Терминальная операция - forEach()");
        System.out.println("Проверка на наличие пустых слов и Null(nonNull), а также выборка слов по символам 'a':");
        listName.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.isEmpty() && name.contains("a"))
                .forEach(System.out::println);

        System.out.println("Терминальная операция - map(), сделать первые буквы заглавные:");
        listName.stream()
                .filter(Objects::nonNull)
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                .sorted()   // сортировка элементов (по числам по возрастани, слова в алфавитном порядке)
                .forEach(System.out::println);

        System.out.println("-----------");
        System.out.println("Терминальная операция - map() и сортировка по именам sorted():");

        List<CarForStreamApi> listCar = new ArrayList<>();
        listCar.add(new CarForStreamApi(1999, "Ford"));
        listCar.add(new CarForStreamApi(1995, "Ferrari"));
        listCar.add(new CarForStreamApi(2000, "Mercedes"));

        listCar.stream()
                .map(elem -> elem.getAge() + " - " + elem.getName())
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----------");
        System.out.println("Терминальная операция - collect() и filter() по количеству букв в слове:");

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Karl");
        names.add("Bob");
        names.add("John");
        List<String> newName = names.stream()
                .filter(element->element.length()>3)
                .collect(Collectors.toList());
        System.out.println(names);
        System.out.println(newName);
    }
}
