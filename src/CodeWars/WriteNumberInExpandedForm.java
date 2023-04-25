package CodeWars;

public class WriteNumberInExpandedForm {
    public static void main(String[] args) {
        int number = 101;
        String array = String.valueOf(number);
        int count = array.length() - 1;
        String zero = "";
        while (count > 0) {
            zero += "0";
            count--;
        }
        count = array.length() - 1;
        StringBuilder text = new StringBuilder();
        for (String str : array.split("(?<=.)")) {
            if (str.equals("0")) {
                if(!zero.isEmpty()) zero = zero.substring(1);
                count--;
                continue;
            }
            text.append(str);
            if (count > 0) {
                text.append(zero);
                text.append("+");
                zero = zero.substring(1);
                count--;
            }
        }
        System.out.println(text);
    }
}
