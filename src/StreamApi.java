import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 12, 0, 6, 123, 3);

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


        List<String> listName = Arrays.asList("kurt", "ivashka", null);
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
                .filter(element->element.length()>3)
                .collect(Collectors.toList());
        System.out.println(names);
        System.out.println(newName);
    }
}
