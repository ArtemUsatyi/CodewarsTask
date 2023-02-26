import javax.swing.*;
import java.util.*;
import java.util.stream.*;

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
        List<Integer> numbersNew = asList(1, 2, 3, 4, 5);
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
        List<String> str = asList("aaaa", "bbb", "c", "ddddddd", "aaaa", "cc");
        str.stream()
                .distinct()
                .forEach(i -> System.out.println(i));
        // distinct - находит и возвращает только уникальные значения, остальные он отбрасывает
        // если использвовать его для класса, где нет реализван EQUAL то сравниваться значения не будут

        System.out.println("Сортировка по имени в обратном порядке, sorted:");
        listCar.stream()
                .sorted(Comparator.comparing(CarForStreamApi::getName).reversed())
                .forEach(i -> System.out.println(i.getName()));

        System.out.println("-----------");
        System.out.println("Сумма всех чисел в массиве(потоке, списке) reduce():");
        Optional<Integer> sumNumber = numbersNew.stream()
                .reduce((left, right) -> left + right);
        System.out.println(sumNumber);

        int summNumber = numbersNew.stream()
                //(10*(left+right))
                .reduce(100, (left, right) -> right + left);
        System.out.println("Сумма = " + summNumber);

        int sumIdentityNumber = numbersNew.stream()
                .reduce(2, (identity, val) -> identity * val);
        System.out.println("Произведение всех значений: " + sumIdentityNumber);

        int minValue = numbersNew.stream()
                .reduce(Integer.MAX_VALUE, (left, right) -> left < right ? left : right);
        //.reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("Найти минимальное значение: " + minValue);

        int maxValue = numbersNew.stream()
                .reduce(Integer.MIN_VALUE, Integer::max);
        System.out.println("Найти минимальное значение: " + maxValue);

        String strLightMax = str.stream()
                .reduce("", (left, right) -> left.length() > right.length() ? left : right);
        System.out.println("Найти самую длинную строку: " + strLightMax);

        String strLightMin = str.stream()
                .reduce(" ", (left, right) -> left.length() < right.length() ? left : right);
        System.out.println("Найти самую длинную строку: " + strLightMin);

        System.out.println("-----------");
        System.out.println("Лимит (limit) по выбору элементов и пропустить определенное кол-во элементов (Skip)");
        str.stream()
                .limit(2)
                .forEach(elem -> System.out.println("Вывести только 2 элемента - " + elem));

        str.stream()
                .skip(2)
                .forEach(elem -> System.out.println("Прописутить 2 элемента, остальное вывести - " + elem));

        System.out.println("-----------");
        System.out.println("Generics Stream INT, LONG, DOUBLE (IntStream, LongStream, DoubleStream)");
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
        LongStream longStream = LongStream.of(6, 7, 8, 9, 10);
        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3, 4.4);

        System.out.println("IntStream, LongStream - при использовании метода range()(происходит создание элементов в диапазоне (1,10)) " +
                " в DoubleStream НЕЛЬЗЯ использовать метод range()");
        IntStream intStreamRange = IntStream.range(1, 10); // от 1 до 99
        intStreamRange.filter(elem -> elem % 2 == 0).forEach(i -> System.out.println(i));

        LongStream longStreamRang = LongStream.rangeClosed(1, 10); // от 1 до 10 ДИАПАЗОН ТЕПЕРЬ ВКЛ. ПОСЛЕДНИЙ ЭЛЕМЕНТ

        // IntStream можно преобразовать в LongStream, либо в DoubleStream. LongStream только в DoubleStream.
        // DoubleStream назад не преобразовывается.

        int[] ints = intStream.toArray(); // преобразования STREAM в массив

        for (int i : ints) {
            System.out.println(i);
        }

        int intSumStream = IntStream.of(1, 2, 3, 4, 5).sum(); // метод SUM() можно применять с методом of() только IntStream
        System.out.println("сумма все элементов в потоке - " + intSumStream);

        OptionalDouble averageStream = LongStream.of(1, 2, 3, 4, 5).average();// метод AVERAGE() вычисляет среднее значение OptionalDouble
        System.out.println("Среднее число с помощью метода average()" + averageStream);

        System.out.println("-----------");
        System.out.println("Optional::::::");
        System.out.println("Optional basics:");
        Optional<String> nameOptional1 = Optional.of("optional"); //Optional.of(null); ---> java.lang.NullPointerException, пустую строку можно ""
        System.out.println("Optional: " + nameOptional1);


        System.out.println("Optional.ofNullable:");
        Optional<String> nameOptional2 = Optional.ofNullable(null);
        System.out.println("Null: " + nameOptional2); // выведит сообщение в консоли Optional.empty

        System.out.println("Optional.empty:");
        Optional<String> nameOptional3 = Optional.empty();
        System.out.println(nameOptional3); // выведит сообщение в консоли Optional.empty

        System.out.println(nameOptional1.get());
//      System.out.println(nameOptional2.get()); будет ошибка, если получать NULL из optional ( NoSuchElementException: No value present )

        System.out.println("Optional isPresent:");
        if (nameOptional1.isPresent()) System.out.println(nameOptional1.get());
        nameOptional1.ifPresent(System.out::println);

        if (nameOptional2.isPresent()) System.out.println(nameOptional2.get());
        else System.out.println("Условие не выполнилось - nameOptional2 содержит NULL");

        System.out.println("Optional orElse:");
        System.out.println(nameOptional2.orElse("Пустота!!!! ")); // Если переменная будет NULL, выполнил действие в скобках

        System.out.println("Optional orElseGet:");
        System.out.println(nameOptional3.orElseGet(() -> "Пустота в другой переменной")); // Если переменная будет NULL, возвращает что в скобках и при этом в лямбда выражении

        System.out.println("Optional orElseThrow:");
//      System.out.println(nameOptional3.orElseThrow(()-> new ArithmeticException()));  Если переменная будет NULL, может пробросить любое исключение

        System.out.println("Optional map :");
        System.out.println(nameOptional1.map(String::toUpperCase).get());

        System.out.println(nameOptional2.map(String::toUpperCase)); // Если переменная будет NULL,  выведит сообщение в консоли Optional.empty

        System.out.println("Optional flatMap :");
        Optional<Optional<String>> name = Optional.of(Optional.of("JOHN"));
        Optional<String> lowerCaseName = name.flatMap(o -> o.map(String::toLowerCase));
        System.out.println(lowerCaseName);  //output Optional[john]
    }
}
