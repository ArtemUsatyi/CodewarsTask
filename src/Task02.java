 import java.util.Scanner;

public class Task02 {
    public static void main(String[] args){
        System.out.println("Введите целочисленное число, является ли число Палиндромом:");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int reminder = 0;
        int a;
        int sum = inputNumber;

       while (sum>0){
           a = sum%10;
           reminder = (reminder*10)+a;
           sum =sum/10;
       }
       if (reminder == inputNumber){
           System.out.println("Число является палиндромом");
       }
       else System.out.println("Число НЕ является палиндромом");
    }
}
