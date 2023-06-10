package CodeWars;

public class AddBinary {
    public static void main(String[] args) {
        String a = "10100000100000000000111";
        String b = "11010100";

        int numA = Integer.parseInt(a,2);
        int numB = Integer.parseInt(b,2);
        System.out.println(Integer.toBinaryString(numA+numB));
    }
}
