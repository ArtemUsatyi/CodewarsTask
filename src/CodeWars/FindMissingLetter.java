package CodeWars;

public class FindMissingLetter {
    public static void main(String[] args) {
        char[] array = {'O', 'Q', 'R', 'S'};

        char foundNumberChar = array[0];

        for (int i = 1; i < array.length; i++) {
            if ((char) (foundNumberChar + 1) == array[i]) foundNumberChar = array[i];
            else {
                System.out.println((char) (foundNumberChar + 1));
                break;
            }
        }
    }
}
