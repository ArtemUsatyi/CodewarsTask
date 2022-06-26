import java.util.Scanner;

public class Task09 {
    public static void main(String [] args){
        int num;
        int item;
        Scanner scanner = new Scanner(System .in);
        System.out.println("Введите количество элементов массива: ");
        num = scanner.nextInt();
        int [] mas = new int [num];

        System.out.println("Заполните массив числами: ");
        for (int i=0; i<num; i++) mas[i] = scanner.nextInt();

        System.out.println("Введите наколько надо добавить единиц: ");
        item = scanner.nextInt();

        masPlus(mas);
    }
    public static void masPlus(int [] mas){
       for (int i = mas.length-1; i>=0; i--){
           if (mas[i] ==9) mas [i]=0;
           else {
               mas[i]++;
               break;
           }
       }
       System.out.print(" ");
        for (int ma : mas) {
            System.out.print(ma + " ");
        }
    }
}
