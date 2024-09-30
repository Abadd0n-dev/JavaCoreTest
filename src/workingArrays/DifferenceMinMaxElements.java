package workingArrays;

public class DifferenceMinMaxElements {
    public static int differenceMinMax (int array []) {
        int min = array[0];
        int max = array[0];

        for (int i : array) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        return max - min;
    }
}
