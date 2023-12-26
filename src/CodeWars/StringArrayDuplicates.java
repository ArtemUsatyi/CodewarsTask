package CodeWars;

import java.util.Arrays;

public class StringArrayDuplicates {
    public static void main(String[] args) {
        String[] arr = {"abracadabra", "allottee", "assessee"};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("([a-z])\\1+", "$1");
        }
        System.out.println(Arrays.toString(arr));

// Реализация через стрим
// return Arrays.stream(arr).map(x->x.replaceAll("(.)(?=\\1)","")).toArray(String[]::new);
    }
}
