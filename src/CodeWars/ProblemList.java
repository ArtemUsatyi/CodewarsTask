package CodeWars;

import java.util.Arrays;

public class ProblemList {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 6;
        int findNumber = 0;
        if (Arrays.binarySearch(nums, target) >= 0) findNumber = Arrays.binarySearch(nums, target);
        else {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] < target) {
                    findNumber = i+1;
                    break;
                }
            }
        }
        System.out.println(findNumber);
    }
}
