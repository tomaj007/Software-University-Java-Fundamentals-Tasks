package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> finalList = Arrays.stream(scanner.nextLine().split("!"))
                .map(String::trim)
                .collect(Collectors.toList());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Go Shopping!")) {
                break;
            }
            String[] a = input.split(" ");
            if (a[0].equals("Urgent")) {
                if (finalList.contains(a[1])) {

                } else {
                    finalList.add(0, a[1]);
                }
            } else if (a[0].equals("Unnecessary")) {

                finalList.remove(a[1]);
            } else if (a[0].equals("Correct")) {
                if (finalList.contains(a[1])) {
                    finalList.add(finalList.indexOf(a[1]), a[2]);
                    finalList.remove(a[1]);

                }

            } else if (a[0].equals("Rearrange")) {
                if (finalList.contains(a[1])) {
                    finalList.remove(a[1]);
                    finalList.add(a[1]);
                }

            }
        }
        System.out.println(String.join(", ", finalList));
    }
}


