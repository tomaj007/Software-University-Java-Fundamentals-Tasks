package Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int array1[] = new int[n];
        int array2[] = new int[n];

        for (int i = 1; i <= n; i++) {

            String s = scanner.nextLine();
            String[] numbers = s.split(" ");
            int num1 = Integer.parseInt(numbers[0]);
            int num2 = Integer.parseInt(numbers[1]);
            if (i % 2 == 0) {
                array1[i - 1] = num1;
                array2[i - 1] = num2;
            } else {
                array2[i - 1] = num1;
                array1[i - 1] = num2;

            }
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }


    }
}
