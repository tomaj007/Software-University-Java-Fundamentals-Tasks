package Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Third2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> finalList = Arrays.stream(scanner.nextLine().split("&"))
                .map(String::trim)
                .collect(Collectors.toList());
        String book = "";
        while (true) {
            String check = scanner.nextLine();
            if (check.equals("Done")) {
                break;
            }
            String input[] = check.split(" \\| ");
            if (input[0].equals("Add Book")) {
                if (finalList.contains(input[1])) {

                } else {
                    finalList.add(0, input[1]);
                }
            } else if (input[0].equals("Take Book")) {
                if (finalList.contains(input[1])) {
                    finalList.remove(input[1]);
                }


            } else if (input[0].equals("Swap Books")) {
                if (finalList.contains(input[1]) && finalList.contains(input[2])) {
                    int firstIndex = finalList.indexOf(input[1]);
                    int secondIndex = finalList.indexOf(input[2]);
                    finalList.remove(input[1]);
                    finalList.remove(input[2]);
                    finalList.add(firstIndex, input[2]);
                    finalList.add(secondIndex, input[1]);
                }

            } else if (input[0].equals("Insert Book")) {
                if (finalList.contains(input[1])) {

                } else {
                    finalList.add(finalList.size(), input[1]);
                }
            } else if (input[0].equals("Check Book")) {
                if (Integer.parseInt(input[1]) > 0 && Integer.parseInt(input[1]) < finalList.size()) {
                    book = finalList.get(Integer.parseInt(input[1]));
                }

            }
        }
        System.out.println(book);
        System.out.print(String.join(", ", finalList));
    }
}