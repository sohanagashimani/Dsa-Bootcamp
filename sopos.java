import java.util.Scanner;

public class sopos {
    public static int[] twoSum(int target, int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            for (int x = i + 1; x < nums.length; x++) {
                int num2 = nums[x];
                if (num1 + num2 == target) {
                    int[] result = { i, x };
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] array =  {1, 3, 4, 6 };
        int[] solution = twoSum(9, array);
        for (int i = 0; i < solution.length; i++) {
            System.out.println(solution[i]);
        }

    }
}
