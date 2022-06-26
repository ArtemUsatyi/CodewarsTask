import java.util.Scanner;

public class Task08 {
    public static void main (String [] args){
        int num;
        int item;
        int first;
        int last;
        Scanner scanner = new Scanner(System .in);

        do {
            System.out.println("Vvedite chislo: ");
            num = scanner.nextInt();
        }
        while(num<=2);{}
        int [] mas = new int [num];

        System.out.println("¬ведите " + num + " чисел дл€ массива");
        for (int i = 0; i < num; i++) mas[i] = scanner.nextInt();

        System.out.println("¬ведите число дл€ бинарного поиска: ");
        item = scanner.nextInt();
        first = 0;
        last = num - 1;

        binarySearch(mas, first, last, item);
    }
    public static void binarySearch(int [] mas, int first, int last, int item){
        int position;
        position = last/2;

        while((mas[position] != item) && (first<=last)){

            if (mas[position] > item){
                last = position - 1;
            }
            else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <=last) System.out.println("¬веденное число: " + item + " находитс€ в массиве на " + position + "-элементе");
        else System.out.println("¬веденное число: " + item + " не найденно в массиве.");
    }
}
