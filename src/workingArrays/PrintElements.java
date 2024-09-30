package workingArrays;

import workingArrays.ArrayCheck;
import workingArrays.DifferenceMinMaxElements;
import workingArrays.EvenElements;

public class PrintElements {
    public static void printEvens () {
        System.out.println("Количество чётных чисел в массиве №1: " +
                EvenElements.countEvens(new int[] {2, 1, 2, 3, 4}));
        System.out.println("Количество чётных чисел в массиве №2: " +
                EvenElements.countEvens(new int[]{2, 2, 0}));
        System.out.println("Количество чётных чисел в массиве №3: " +
                EvenElements.countEvens(new int[]{1, 3, 5}) + "\n");
    }
    public static void printDifference () {
        System.out.println("Разница между самым большим и маленьким числом в массиве №1: " +
                DifferenceMinMaxElements.differenceMinMax(new int[] {2, 1, 2, 3, 4}));
        System.out.println("Разница между самым большим и маленьким числом в массиве №2: " +
                DifferenceMinMaxElements.differenceMinMax(new int[]{2, 2, 0}));
        System.out.println("Разница между самым большим и маленьким числом в массиве №3: " +
                DifferenceMinMaxElements.differenceMinMax(new int[]{1, 3, 5}) + "\n");
    }

    public static void printArrayCheck () {
        System.out.println("Проверка чисел на соседние нули в массиве №1 " +
                ArrayCheck.hasAdjacentZeros(new int[] {0, 0, 3, 4}));
        System.out.println("Проверка чисел на соседние нули в массиве №2 " +
                ArrayCheck.hasAdjacentZeros(new int[] {0, 5, 6, 3, 4}));
        System.out.println("Проверка чисел на соседние нули в массиве №3 " +
                ArrayCheck.hasAdjacentZeros(new int[] {1, 0, 0, 4, 4}) + "\n");
    }
}
