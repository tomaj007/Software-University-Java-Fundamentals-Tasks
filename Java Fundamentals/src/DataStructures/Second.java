
package DataStructures;

import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        // Примерни масиви за сливане
        int[] array1 = {1, 0, 9, 2, 8, 0, 0, 3, 4, 6};
        int[] array2 = {1, 0, 9, 2, 8, 0, 0, 3, 4, 6};

        // Измерване на времето за първия вариант
        long startTime1 = System.nanoTime();
        int[] resultArray1 = mergeArrays1(array1, array2);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;
        // Измерване на времето за втория вариант
        long startTime2 = System.nanoTime();
        int[] resultArray2 = mergeArrays2(array1, array2);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        // Извеждане на резултата и времето за изпълнение
        System.out.println("Масив 1: " + Arrays.toString(array1));
        System.out.println("Масив 2: " + Arrays.toString(array2));
        System.out.println("Слят масив (вариант 1): " + Arrays.toString(resultArray1));
        System.out.println("Време за изпълнение (вариант 1): " + duration1 + " наносекунди");

        System.out.println("Слят масив (вариант 2): " + Arrays.toString(resultArray2));
        System.out.println("Време за изпълнение (вариант 2): " + duration2 + " наносекунди");
    }

    public static int[] mergeArrays1(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Проверка за елементи, които остават в първия масив
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        // Проверка за елементи, които остават във втория масив
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

    public static int[] mergeArrays2(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        // Сливане с междинна проверка
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        // Пренасяне на останалите елементи от първия масив
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }

        // Пренасяне на останалите елементи от втория масив
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }

        return mergedArray;
    }

}
