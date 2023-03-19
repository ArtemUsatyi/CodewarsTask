package CodeWars;

public class SimplerNumbers {
    public static void main(String[] args) {
        long num = 109;
        boolean simplerNum = true;

        if (num <= 1) simplerNum = false;
        else if(num==2) simplerNum = true;
        else if (num % 2 == 0) simplerNum = false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                simplerNum = false;
                break;
            }
        }
        System.out.println(simplerNum);
        System.out.println(40423 * 40423);
    }
}
