package stream_api.functionalInterface.comparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ������� ���������, ������� ��������� 2 ��������� � ����������
        // ������������� �����, ���� ������ ������ ������ �������
        // 0 - ���� ������� ����������.
        // ������������� �����, ���� ������������ ������ �������
        int[] array = new int[]{12, 41, 1, 8, 0, 3};

        // ����������� ������ int � ������ Integer
        Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);

        // ���������� �� �����������
        Arrays.sort(integerArray, Integer::compareTo);

//        ���������� �� ��������, �����������:
//        Arrays.sort(integerArray, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1); // ���������� �� ��������
//            }
//        });

        System.out.println(Arrays.toString(integerArray));
    }
}