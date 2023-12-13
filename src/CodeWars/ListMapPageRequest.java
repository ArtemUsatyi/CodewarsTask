package CodeWars;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.lang.Math.min;
import static java.util.stream.Collectors.toMap;

public class ListMapPageRequest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twenty");
        int pageSize = 3;

        Map<Integer, List<String>> mapPage = IntStream.iterate(0, i -> i + pageSize)
                .limit((list.size() + pageSize - 1) / pageSize)
                .boxed()
                .collect(toMap(i -> (i / pageSize)+1,
                        i -> list.subList(i, min(i + pageSize, list.size()))));

        System.out.println(mapPage.get(0));
        System.out.println(mapPage);
    }
}
