import java.io.IOException;
import java.util.Scanner;

public class Task01 {
    public static void main (String[] args){
        int target;
        Scanner input = new Scanner(System.in); // ��������� Scanner
        System.out.println("��������� ������� ����� 2-� �������� ����� � �������");
        System.out.println("������� ������ �������: ");
        int size = input.nextInt(); // ������ � ���������� ������ ������� � ���������� � size
        int mas[] = new int[size]; // ������ ������ int �������� � size

        System.out.println("��������� ������ ������ �������: ");
        /*�������� �� ����� �������, �������� ���*/
        for (int i = 0; i < size; i++) {
            mas[i] = input.nextInt(); // ��������� ������ ����������, ��������� � ����������
        }
        System.out.println("��������� ������� �� " + mas.length + " �������� :");
        for (int i=0; i<mas.length;i++){
            if (((mas.length)-1) == i){
                try {
                    throw new ArrayIndexOutOfBoundsException();
                }
                catch(ArrayIndexOutOfBoundsException e) {
                    target = mas[mas.length-1];
                    System.out.println(target);
                }
            }
            else{
                target = mas[i] + mas[i+1];
                System.out.println(target);
                i++;
            }
        }
    }
}
