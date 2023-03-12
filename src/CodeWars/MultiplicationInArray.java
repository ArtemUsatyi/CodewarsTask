package CodeWars;

public class MultiplicationInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 30};
        long[] newArray = new long[array.length];

        for (int i = 0; i < array.length; i++) {
            long longNum = 1;

            for (long element : array) {
                longNum = element * longNum;
            }
            newArray[i] = longNum / array[i];
        }
        for(long l : newArray){
            System.out.println(l);
        }
    }
}
