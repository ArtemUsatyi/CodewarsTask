import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> numbers = asList(1, 4, 12, 0, 6, 123, 3);

        System.out.println("������������� �������� - filter()");
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .forEach(i -> System.out.println("������ ����� " + i));

        System.out.println("-----------");
        System.out.println("������������� �������� - map()");
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
        System.out.println("������������ �������� - count()");
        System.out.println("����� ���������� ���� � ������, ��� ����� ���� � ������ ��������� ������ 4: " + count);


        System.out.println("-----------");
        System.out.println("������������ �������� - forEach()");
        System.out.println("�������� �� ������� ������ ���� � Null(nonNull), � ����� ������� ���� �� �������� 'a':");
        listName.stream()
                .filter(Objects::nonNull)
                .filter(name -> !name.isEmpty() && name.contains("a"))
                .forEach(System.out::println);

        System.out.println("������������ �������� - map(), ������� ������ ����� ���������:");
        listName.stream()
                .filter(Objects::nonNull)
                .map(x -> x.substring(0, 1).toUpperCase() + x.substring(1))
                .sorted()   // ���������� ��������� (�� ������ �� ����������, ����� � ���������� �������)
                .forEach(System.out::println);

        System.out.println("-----------");
        System.out.println("������������ �������� - map() � ���������� �� ������ sorted():");

        List<CarForStreamApi> listCar = new ArrayList<>();
        listCar.add(new CarForStreamApi(1999, "Ford"));
        listCar.add(new CarForStreamApi(1995, "Ferrari"));
        listCar.add(new CarForStreamApi(2000, "Mercedes"));

        listCar.stream()
                .map(elem -> elem.getAge() + " - " + elem.getName())
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----------");
        System.out.println("������������ �������� - collect() � filter() �� ���������� ���� � �����:");

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
        System.out.println("������������ �������� - collect() � ��������� � groupingBy():");

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
//      ����� �������������� ������ ��� ������������� Stream Api:
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
        System.out.println("������������ �������� - collect() � ��������� � groupingBy() � counting() ���������� ��� LONG:");
        Map<String, Long> mapCountFriend = humanList.stream()
                .collect(Collectors.groupingBy(HumanForStreamApi::getSurname, Collectors.counting()));
        System.out.println(mapCountFriend);

        System.out.println("-----------");
        System.out.println("������������ �������� - collect() � ��������� � property + sum:");
        Map<String, Long> mapSumFriend = humanList.stream()
                .collect(Collectors.groupingBy(HumanForStreamApi::getSurname, Collectors.summingLong(HumanForStreamApi::getCountFriend)));
        System.out.println(mapSumFriend);

        System.out.println("-----------");
        System.out.println("������������ �������� - collect() � ��������� � mapping():");
        Map<String, Set<String>> mapName = humanList.stream()
                .collect(Collectors.groupingBy(HumanForStreamApi::getSurname, Collectors.mapping(HumanForStreamApi::getName, Collectors.toSet())));
        System.out.println(mapName);

        System.out.println("-----------");
        System.out.println("������������ �������� - collect() � ��������� � flatMap():");

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
                //.flatMap(human -> human.getPets().stream())  ��� ����� ������ 2-� ����� ������������ ����
                .collect(Collectors.toList());
        System.out.println(allPets);

//        List<String> allPets = new ArrayList<>();
//        for (HumanPetsStreamApi element : humanPets) {
//            allPets.addAll(element.getPets());
//        }
//        System.out.println(allPets);

        System.out.println("-----------");
        System.out.println("������������ �������� - collect() � ��������� � flatMapToInt() �������������� ���������� � ���������� ������:");
        int[][] array = {{1, 2}, {3, 4}};
        int[] arrayOne = Arrays.stream(array)
                .flatMapToInt(i -> Arrays.stream(i))
                .toArray();
        System.out.println(Arrays.toString(arrayOne));

        System.out.println("-----------");
        System.out.println("����� ������ filter() � findAny() ��� findFirst():");
        List<String> string = asList("Java", "super Java", "Java 8", "I like Java", "I love");
//        ��� ������� Stream-�� (����������������) ��� ���������� �������� ��������� ����� ���� � ��� ��.
//        ��� ������������ (parallelStream) �� - ������ ������
        Optional<String> optional = string.parallelStream()
                .filter(s -> s.contains("Java"))
                .findAny();
        System.out.println(optional);

        System.out.println("-----------");
        System.out.println("����� ������ filter() � findAny() ��� findFirst():");
        List<Integer> numbersNew = asList(1, 2, 3, 4, 5, 60, 71, 8, 9, 10);
        Optional<Integer> optionalNum = numbersNew.stream()
                .filter(i -> i > 4)
                .findAny();
        System.out.println(optionalNum);

        System.out.println("-----------");
        System.out.println("����� ������ filter() � anyMatch(), allMatch(), noneMatch():");
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
        System.out.println("Stream-� ����� ����� ��������� ������������ ���������, ���������� ���� distinct, sorted, parallel, sequential:");
        List<String> srt = asList("a", "b", "c", "d", "a", "c");
        srt.stream()
                .distinct()
                .forEach(i -> System.out.println(i));
        // distinct - ������� � ���������� ������ ���������� ��������, ��������� �� �����������
        // ���� ������������� ��� ��� ������, ��� ��� ��������� EQUAL �� ������������ �������� �� �����

        System.out.println("���������� �� ����� � �������� �������, sorted:");
        listCar.stream()
                .sorted(Comparator.comparing(CarForStreamApi::getName).reversed())
                .forEach(i -> System.out.println(i.getName()));

    }
}
