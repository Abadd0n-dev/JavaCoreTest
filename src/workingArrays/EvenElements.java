package workingArrays;

public class EvenElements {
    public static int countEvens (int array []) {
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
