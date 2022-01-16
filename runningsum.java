import java.util.Arrays;

public class runningsum {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, // 0th index
                { 4, 5 }, // 1st index
                { 6, 7, 8, 9 } // 2nd index -> arr[2] = {6, 7, 8, 9}
        };
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
        }

    }
}
