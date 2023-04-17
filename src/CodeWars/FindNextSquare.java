package CodeWars;

public class FindNextSquare {
    public static void main(String[] args) {
        long square = 144;
        if (Math.sqrt(square) % 1 == 0.0) {
            System.out.println(Math.pow(Math.sqrt(square) + 1, 2));
        } else System.out.println(-1);
    }
}
