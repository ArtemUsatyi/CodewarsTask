import java.util.Scanner;

public class Task10 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System .in);
        System.out.println("¬ведите первую бинарную строку: ");
        String a = scanner.nextLine();
        System.out.println("¬ведите вторую бинарную строку: ");
        String b = scanner.nextLine();
        binaryAdd(a, b);
    }
    public static void binaryAdd(String a, String b){

        int i = a.length()-1;
        int j = b.length()-1;
        int buffer = 0;
        int result = 0;
        StringBuffer  str = new StringBuffer (" ");

       while (i>=0){
           if(a.charAt(i) == '1' && b.charAt(j) == '1'){
               result = buffer;
               buffer = 1;
           }
           else if(a.charAt(i) == '1' && b.charAt(j) == '0'){
               result = 1;
               buffer = 0;
           }
           else if(a.charAt(i) == '0' && b.charAt(j) == '1'){
               result = 1;
               buffer = 0;
           }
           else if(a.charAt(i) == '0' && b.charAt(j) == '0'){
               result = buffer;
               buffer = 0;
           }
           i--;
           j--;
           str.insert(0, result);
       }
        System.out.println(str);
    }
}
