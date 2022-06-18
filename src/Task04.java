import static java.lang.Math.min;

public class Task04 {

   public static void main (String[] args){
       int prefix = 0;
       int j = 0;
       int a;
       String [] str = new String[] {"flower","flower","flower"};
       a = Math.min(str[0].length(), str[1].length());
       a = Math.min(a, str[2].length());
       for(int i=0; i<a; i++)
       {
           if (str[0].charAt(j) == str[1].charAt(j) && str[0].charAt(j) == str[2].charAt(j)) {
               prefix++;
               j++;
           }
       }
       System.out.println(str[0].substring(0,prefix));
   }
}
