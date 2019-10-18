package arrayReversor;

import java.util.Arrays;

public class ArrayReversor {
    public static void main(String[] args) {
        int[] reverse = new int[]{9, 5, 4, 0, 3, 1};
        System.out.println(Arrays.toString(reverseArray(reverse)));
    }

    private static int[] reverseArray(int[] reverse) {

        int len = reverse.length;
        int[] arr = new int[len];
        int j = 0;
        for (int i = len - 1; i >= 0; i--) {
            arr[j] = reverse[i];
            j++;
        }
        return arr;
    }
}