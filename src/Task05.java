public class Task05 {
    public static void main(String[] args) {
        int[] mas = new int[]{0, 0, 1, 1, 2, 5, 3, 4};
        int target = mas.length;
        int sum = 0;
        for (int ma : mas) {
            ++sum;
            for (int j = sum; j < mas.length; j++) {
                if (ma == mas[j]) --target;
            }
        }
        System.out.println(" оличество уникальных чисел в массиве = " + target);
    }
}

