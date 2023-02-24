import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 4, 12, 0, 6, 123, 3);

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


        List<String> listName = asList("kurt", "ivashka", null);
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
                .filter(element -> element.length() > 3)
                .collect(Collectors.toList());
        System.out.println(names);
        System.out.println(newName);

        System.out.println("-----------");
        System.out.println("Терминальная операция - collect() в сочетании с groupingBy():");

        List<HumanForStreamApi> humanList = new ArrayList<>();
        humanList.add(new HumanForStreamApi(10, "Putin", "Russia"));
        humanList.add(new HumanForStreamApi(1, "Biden", "USA"));
        humanList.add(new HumanForStreamApi(3, "Macron", "France"));
        humanList.add(new HumanForStreamApi(1, "Merkel", "USA"));
        humanList.add(new HumanForStreamApi(5, "Miller", "Russia"));
        humanList.add(new HumanForStreamApi(4, "Zyuganov", "Russia"));

        Map<String, List<HumanForStreamApi>> mapList = humanList.stream()
                .collect(Collectors.groupingBy(elem -> elem.getSurname()));
        System.out.println(mapList);
//      Внизу альтернативный варинт без использования Stream Api:
//      Map<String, List<HumanForStreamApi>> mapList = new HashMap<>();
//        for (HumanForStreamApi human : humanList) {
//            if (!mapList.containsKey(human.getSurname())) {
//                List<HumanForStreamApi> humanFirst = new ArrayList<>();
//                humanFirst.add(human);
//                mapList.put(human.getSurname(), humanFirst);
//            } else {
//                List<HumanForStreamApi> humanOld = mapList.get(human.getSurname());
//                humanOld.add(human);
//            }
//        }
//        System.out.println(mapList);

        System.out.println("-----------");
        System.out.println("Терминальная операция - collect() в сочетании с groupingBy() и counting() возвращает тип LONG:");
        Map<String, Long> mapCountFriend = humanList.stream()
                .collect(Collectors.groupingBy(HumanForStreamApi::getSurname, Collectors.counting()));
        System.out.println(mapCountFriend);

        System.out.println("-----------");
        System.out.println("Терминальная операция - collect() в сочетании с property + sum:");
        Map<String, Long> mapSumFriend = humanList.stream()
                .collect(Collectors.groupingBy(HumanForStreamApi::getSurname, Collectors.summingLong(HumanForStreamApi::getCountFriend)));
        System.out.println(mapSumFriend);

        System.out.println("-----------");
        System.out.println("Терминальная операция - collect() в сочетании с mapping():");
        Map<String, Set<String>> mapName = humanList.stream()
                .collect(Collectors.groupingBy(HumanForStreamApi::getSurname, Collectors.mapping(HumanForStreamApi::getName, Collectors.toSet())));
        System.out.println(mapName);

        System.out.println("-----------");
        System.out.println("Терминальная операция - collect() в сочетании с flatMap():");

        List<HumanPetsStreamApi> humanPets = new ArrayList<>();

        Stream<String> namePets = Stream.of("Tobik", "Bobik");
        List<String> pets = namePets.collect(Collectors.toList());
        humanPets.add(new HumanPetsStreamApi("Tom", pets));

        Stream<String> namePet = Stream.of("Vilfi");
        pets = namePet.collect(Collectors.toList());
        humanPets.add(new HumanPetsStreamApi("Tom", pets));

        List<String> allPets = humanPets.stream()
                .map(human -> human.getPets())
                .flatMap(pet -> pet.stream())
                //.flatMap(human -> human.getPets().stream())  ИЛИ МОЖНО ВМЕСТО 2-х строк использовать ОДНУ
                .collect(Collectors.toList());
        System.out.println(allPets);

//        List<String> allPets = new ArrayList<>();
//        for (HumanPetsStreamApi element : humanPets) {
//            allPets.addAll(element.getPets());
//        }
//        System.out.println(allPets);

        System.out.println("-----------");
        System.out.println("Терминальная операция - collect() в сочетании с flatMapToInt() преобразование двумерного в одномерный массив:");
        int[][] array = {{1, 2}, {3, 4}};
        int[] arrayOne = Arrays.stream(array)
                .flatMapToInt(i -> Arrays.stream(i))
                .toArray();
        System.out.println(Arrays.toString(arrayOne));

        System.out.println("-----------");
        System.out.println("Поиск данных filter() и findAny() или findFirst():");
        List<String> string = asList("Java", "super Java", "Java 8", "I like Java", "I love");
//        Для обычных Stream-ов (последовательных) при нескольких запусках результат будет один и тот же.
//        Для параллельных (parallelStream) же - всегда разный
        Optional<String> optional = string.parallelStream()
                .filter(s -> s.contains("Java"))
                .findAny();
        System.out.println(optional);

        System.out.println("-----------");
        System.out.println("Поиск данных filter() и findAny() или findFirst():");
        List<Integer> numbersNew = asList(1, 2, 3, 4, 5, 60, 71, 8, 9, 10);
        Optional<Integer> optionalNum = numbersNew.stream()
                .filter(i -> i > 4)
                .findAny();
        System.out.println(optionalNum);

        System.out.println("-----------");
        System.out.println("Поиск данных filter() и anyMatch(), allMatch(), noneMatch():");
        boolean anyMatch = numbers.stream()
                .anyMatch(num -> num % 2 == 0);
        System.out.println("AnyMatch - " + anyMatch);

        boolean allMatch = numbers.stream()
                .allMatch(num -> num > 0);
        System.out.println("AllMatch - " + allMatch);

        boolean noneMatch = numbers.stream()
                .noneMatch(num -> num < 0);
        System.out.println("noneMatch - " + noneMatch);

        System.out.println("-----------");
        System.out.println("Stream-ы могут иметь различные модификаторы состояния, рассмотрим след distinct, sorted, parallel, sequential:");
        List<String> srt = asList("a", "b", "c", "d", "a", "c");
        srt.stream()
                .distinct()
                .forEach(i -> System.out.println(i));
        // distinct - находит и возвращает только уникальные значения, остальные он отбрасывает
        // если использвовать его для класса, где нет реализван EQUAL то сравниваться значения не будут

        System.out.println("Сортировка по имени в обратном порядке, sorted:");
        listCar.stream()
                .sorted(Comparator.comparing(CarForStreamApi::getName).reversed())
                .forEach(i -> System.out.println(i.getName()));

    }
}
