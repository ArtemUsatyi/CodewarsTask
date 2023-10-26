package CodeWars;

public class HumanReadableTime {
    public static void main(String[] args) {
        int seconds = 60;

        int h = seconds / 60 / 60;
        int min = seconds / 60 % 60;
        int sec = seconds % 60;
        System.out.printf("%02d:%02d:%02d%n", h, min, sec);
    }
}
