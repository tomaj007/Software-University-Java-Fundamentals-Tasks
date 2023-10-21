package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> finalList = Arrays.stream(scanner.nextLine().split(", "))
                .map(String::trim)
                .collect(Collectors.toList());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Craft!")) {
                break;
            }
            String[] a = input.split(" - ");
            String[] a1 = a[1].split(":");
            if (a[0].equals("Collect")) {
                if (finalList.contains(a[1])) {

                } else {
                    finalList.add(a[1]);
                }
            } else if (a[0].equals("Drop")) {

                finalList.remove(a[1]);
            } else if (a[0].equals("Combine Items")) {
                if (finalList.contains(a1[0])) {
                    finalList.add(finalList.indexOf(a1[0]) + 1, a1[1]);
                }
            } else if (a[0].equals("Renew")) {
                if (finalList.contains(a[1])) {
                    finalList.remove(a[1]);
                    finalList.add(a[1]);
                }

            }
        }
        System.out.println(String.join(", ", finalList));
    }
}
