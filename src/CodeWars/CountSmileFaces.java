package CodeWars;

import java.util.Arrays;
import java.util.List;

public class CountSmileFaces {
    public static void main(String[] args) {
        List<String> listSmileFaces = Arrays.asList(":-)", "-(", ";-D", ":-D", ";-(");
        // ����� ������ ����������� �����
        // ����� : ;
        // ��� ) D
        // ��� (�� ������) - ~
        int count = 0;
        for (String elem : listSmileFaces) {
            if (elem.matches("[:;][-~]?[)D]")) count++;
        }
        System.out.println(count);
        // ������������� ������
       // (int)arr.stream().filter( x -> x.matches("[:;][-~]?[)D]")).count();
    }
}
