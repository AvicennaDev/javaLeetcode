package two_sum_1;

/**
 * https://leetcode.com/problems/two-sum/
 * Вернуть индексы 2 чисел из массива nums, так чтобы они составляли сумму target
 */

public class TwoSum_1 {

    public static void main(String[] args) {
        // write your code here
        int[] nums = new int[]{4, 3, 5, 15};
        int target = 8;
        int[] findDigit = findSum(nums, target);

        System.out.println("[" + findDigit[0] + "," + findDigit[1] + "]");
    }

    private static int[] findSum(int[] nums, int target) {
        int countNums = nums.length;
        int[] findDigit = new int[2];
        for (int in_1 = 0; in_1 < countNums; in_1++) {
            for (int in_2 = 0; in_2 < countNums; in_2++) {
                if (((nums[in_1] + nums[in_2]) == target) && (in_1 != in_2)) {
                    findDigit[0] = in_1;
                    findDigit[1] = in_2;
                    return findDigit;
                }
            }
        }
        return findDigit;
    }
}
