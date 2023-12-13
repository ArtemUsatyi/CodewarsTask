public class Random {
    public static void main(String[] args) {
        String str = "привет как дела что делаешь";
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
