package CodeWars;

public class ValidPhoneNumber {
    public static void main(String[] args) {
        String numberPhone = "(123) 456-7890";
        if (numberPhone.matches("[(]\\d{3}[)] \\d{3}-\\d{4}")) System.out.println("�������������� ����� ��������");
        else System.out.println("�� �������������� ����� ��������");
    }
}
