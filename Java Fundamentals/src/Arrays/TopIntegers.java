package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intArray[] = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isBigger = false;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i; j < intArray.length; j++) {

                if (intArray[i] > intArray[j]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                }
            }
            if (isBigger)
                System.out.print(intArray[i] + " ");
        }
        System.out.print(intArray[intArray.length - 1]);
    }
}
