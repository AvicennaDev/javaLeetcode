package arrayFromPermutation_1920;

/**
 * https://leetcode.com/problems/build-array-from-permutation/
 */
public class ArrayFromPermutation_1920 {
    public static void main(String[] args) {
        int[] nums = new int[]{
                5, 0, 1, 2, 3, 4
        };
        // формула
        // int[] ans = buildArray(nums);

        int[] ans = buildArray(nums);

        for (int i : ans) {
            System.out.print(i);
        }

    }

    // реализовать num[num [i]] т.е. num[содержимое num[i]]
    private static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        int finishArrNum = nums.length;
        int digitInNum = 0;

        for (int index = 0; index < finishArrNum; index++) {
            //узнать что лежит в ячейке и сохранить это число
            digitInNum = nums[index];

            // узнать что лежит в ячейке под номером числа(вставить это число в индекс) взятого из ячейки
            digitInNum = nums[digitInNum];

            // сохранить новое найденное число в новый массив заплняющийся по порядку
            ans[index] = digitInNum;
        }
        return ans;
    }

    // аналог с гугла
    private static int[] buildArray_1(int[] nums) {
        final int n = nums.length;

        for (int i = 0; i < n; ++i)
            nums[i] += n * (nums[nums[i]] % n);

        for (int i = 0; i < n; ++i)
            nums[i] /= n;

        return nums;
    }
}
