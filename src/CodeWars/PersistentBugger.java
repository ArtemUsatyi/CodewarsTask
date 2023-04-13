package CodeWars;

public class PersistentBugger {
    public static void main(String[] args) {
        long number = 39L;
        int count = 0;
        int[] array = String.valueOf(number).chars().map(Character::getNumericValue).toArray();
        int numberMulti = 1;
        while (true) {
            if (array.length > 1) {
                count++;
                numberMulti = 1;
                for (int elem : array) {
                    numberMulti *= elem;
                }
            } else break;
            array = String.valueOf(numberMulti).chars().map(Character::getNumericValue).toArray();
        }
        System.out.println(count);
    }
}
