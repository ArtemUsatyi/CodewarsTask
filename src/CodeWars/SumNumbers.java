package CodeWars;

import java.util.OptionalLong;
import java.util.stream.LongStream;

public class SumNumbers {
    public static void main(String[] args) {
        int value = 3;

        int count=0;
        // ���������� 1-�� ������� Z(3) = sum(1)+sum(1+2)+sum(1+2+3) ����: z(3)=10
        for (int i = 1; i < value+1; i++) {
            count += LongStream.rangeClosed(1, i).reduce(Long::sum).getAsLong();
        }
        // ���������� 2-�� ������� S(10) = 1+2+3+4+5+6+7+8+9+10
        OptionalLong countNumber = LongStream.rangeClosed(1, count).reduce((x, y)->x+y);
        long longNew = countNumber.getAsLong();
        System.out.println(longNew);
    }
}
