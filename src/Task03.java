import java.util.Scanner;
public class Task03 {
        public static void main (String[] args){
            String roman = "CMLXXXVIII";
            int number=0;
            int [] mas = new int[20];
            int [] rezult = new int[20];
            int k = 0;

           for (int i=0; i<roman.length(); i++){
               mas[i] = romanToNumber(roman.charAt(i));
           }

           while (k<roman.length()){
               if (mas[k]>mas[k+1]){
                   rezult[k]=mas[k];
                   k++;
               }
               else if(mas[k]==mas[k+1]){
                   rezult[k]=mas[k]+mas[k];
                   k++;
                   k++;
               }
               else if(mas[k]<mas[k+1]){
                   rezult[k]=mas[k+1]-mas[k];
                   k++;
                   k++;
               }
           }

            for (int j=0; j<roman.length(); j++){
                number = number + rezult[j];
            }
            System.out.println(number);
        }
        public static int romanToNumber(char a){
            return switch (a){
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
        }
}
