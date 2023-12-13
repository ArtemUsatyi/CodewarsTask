package CodeWars;

import static java.util.Objects.isNull;

public class isNullClass {
    public static void main(String[] args) {
        String test = "null";
        String test1 = "2";
        String test2 = "1";
        Boolean flag = isNull(test) && isNull(test1) && isNull(test2) ;
        System.out.println(flag);
    }
}
