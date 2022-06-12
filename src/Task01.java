import java.io.IOException;
import java.util.Scanner;

public class Task01 {
    public static void main (String[] args){
        int target;
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Программа считает сумму 2-х соседних чисел в массиве");
        System.out.println("Укажите размер массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int mas[] = new int[size]; // Создаём массив int размером в size

        System.out.println("Заполните массив целыми числами: ");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            mas[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.println("Результат массива из " + mas.length + " символов :");
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
