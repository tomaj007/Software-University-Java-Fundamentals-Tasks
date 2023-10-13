package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < array.length; i++) {
            int sumOfLeft = 0;
            int sumOfRight = 0;
            for (int j = 0; j < i; j++) {
                sumOfLeft = sumOfLeft + array[j];
            }

            for (int x = i + 1; x < array.length; x++) {
                sumOfRight = sumOfRight + array[x];
            }
            if (sumOfLeft == sumOfRight) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
