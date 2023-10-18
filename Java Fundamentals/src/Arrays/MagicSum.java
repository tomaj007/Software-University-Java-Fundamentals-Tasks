package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-1; j++) {
                if (array[i] + array[j] == n) {
                    System.out.println(array[j] + " " + array[i]);
                }
            }

        }
    }
}