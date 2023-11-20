package DataStructures;
public class First {
        public static void main(String[] args) {
            // Примерни масиви за сливане
            int[] array1 = {1, 3, 5, 7};
            int[] array2 = {2, 4, 6, 8};

            // Извикване на функцията за сливане
            int[] resultArray = mergeArrays(array1, array2);

            // Извеждане на резултата
            System.out.print("Масив 1: ");
            printArray(array1);
            System.out.print("Масив 2: ");
            printArray(array2);
            System.out.print("Слят масив: ");
            printArray(resultArray);
        }

        public static int[] mergeArrays(int[] arr1, int[] arr2) {
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

        public static void printArray(int[] arr) {
            for (int value : arr) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


