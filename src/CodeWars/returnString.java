package CodeWars;

public class returnString {
    public static void main(String[] args) {
        // � ����� �������� ����� � ������� CamelCase, ������ ������� ������ ����� ���������, ��������� ��������
        String text = "artem";
        System.out.println("Hello " + text.substring(0, 1).toLowerCase() + text.substring(1) + "!");
    }
}
