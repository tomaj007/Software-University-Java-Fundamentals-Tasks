import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int array[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            sum =sum+ array[i];

        }
        for (int j = 0; j < n; j++) {
            System.out.print(array[j]+" ");
        }
        System.out.print("\n"+sum);
    }
}
