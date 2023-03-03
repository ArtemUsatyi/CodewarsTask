package CodeWars;

public class returnString {
    public static void main(String[] args) {
        // в ћетод получаем имена в формате CamelCase, задача сделать первую букву «аглавную, остальные строчные
        String text = "artem";
        System.out.println("Hello " + text.substring(0, 1).toLowerCase() + text.substring(1) + "!");
    }
}
