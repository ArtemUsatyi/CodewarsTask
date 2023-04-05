package CodeWars;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static void main(String[] args) {
        String text = ("Indivisibility"); // 1
        List<Character> listChar = text.toLowerCase().chars().mapToObj(i -> (char) i).collect(Collectors.toList());
        HashMap<Character, Integer> hashMapText = new HashMap<>();
        for (char elem : listChar) {
            if (hashMapText.containsKey(elem)) {
                hashMapText.put(elem, hashMapText.get(elem) + 1);
            } else hashMapText.put(elem, 0);
        }
        int count=0;
        for(HashMap.Entry<Character, Integer> entry : hashMapText.entrySet()) {
           if(entry.getValue()>0) count++;
        }
        System.out.println(count);
    }
}
