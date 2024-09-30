package workingArrays;

public class ArrayCheck {
    public static boolean hasAdjacentZeros(int[] arr) {
        if (arr == null || arr.length < 2) {
            return false;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }

        return false;
    }
}
