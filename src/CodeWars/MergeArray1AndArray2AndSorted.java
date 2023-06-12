package CodeWars;

import java.util.Arrays;

public class MergeArray1AndArray2AndSorted {
    public static void main(String[] args) {
        int[] nums1 = {10, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6, 7, 6, 7};
        int n = 6;

        int[] arrayMerge = new int[m + n];
        for (int i = 0; i < m; i++) {
            arrayMerge[i] = nums1[i];
        }
        for (int i = 0, j = m; i < n; i++, j++) {
            arrayMerge[j] = nums2[i];
        }
        //Arrays.sort(arrayMerge);
        for (int i = 0; i < arrayMerge.length - 1; i++) {
            for (int j = 0; j < arrayMerge.length - 1; j++) {
                if (arrayMerge[j] > arrayMerge[j + 1]) {
                    int value = arrayMerge[j];
                    arrayMerge[j] = arrayMerge[j + 1];
                    arrayMerge[j + 1] = value;
                }
            }
        }
        nums1 = arrayMerge;
        System.out.println(Arrays.toString(nums1));
    }
}
