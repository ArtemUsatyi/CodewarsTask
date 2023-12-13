package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;

public class PairOfGloves {
    public static void main(String[] args) {
        String[] gloves = {"1", "1", "2", "2", "4", "2", "3", "4", "2", "3"};

        ArrayList<String> glovesList = new ArrayList<>(Arrays.asList(gloves));
        int countGloves = 0;
        for (int i = 1; i < glovesList.size(); i++) {
            String glove = glovesList.get(0);
            if (glove.equals(glovesList.get(i))) {
                countGloves++;
                glovesList.remove(i);
                glovesList.remove(glove);
                i = 0;
            } else if (glovesList.size() == i) {
                glovesList.remove(glove);
            }
        }
        System.out.println(countGloves);
    }
}
