package CodeWars;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SumNumbers {
    public static void main(String[] args) {
        int value = 100;

        int count=0;
        // вычисление 1-ой функции Z(3) = sum(1)+sum(1+2)+sum(1+2+3) Итог: z(3)=10
        for (int i = 1; i < value+1; i++) {
            count += LongStream.rangeClosed(1, i).reduce(Long::sum).getAsLong();
        }
        // вычисление 2-ой функции S(10) = 1+2+3+4+5+6+7+8+9+10
        System.out.println(IntStream.rangeClosed(1, count).mapToObj(BigInteger::valueOf).reduce(BigInteger::add).get());
    }
}
