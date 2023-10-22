package Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> finalList = Arrays.stream(scanner.nextLine().split(", "))
                .map(String::trim)
                .collect(Collectors.toList());
        int blackListed = 0;
        int lostNames = 0;
        while (true) {
            String check = scanner.nextLine();
            String input[] = check.split(" ");
            if (input[0].equals("Blacklist")) {
                if (finalList.contains(input[1])) {

                    finalList.add(finalList.indexOf(input[1]), "Blacklisted");
                    finalList.remove(input[1]);
                    blackListed++;
                    System.out.printf("%s was blacklisted.%n", input[1]);

                } else {
                    System.out.printf("%s was not found.%n", input[1]);
                }
            } else if (input[0].equals("Error")) {
                if (Integer.parseInt(input[1]) >= 0 && Integer.parseInt(input[1]) < finalList.size()) {
                    if (finalList.get(Integer.parseInt(input[1])).equals("Blacklisted") || finalList.get(Integer.parseInt(input[1])).equals("Lost")) {

                    } else {
                        String lostGuy=finalList.get(Integer.parseInt(input[1]));
                        finalList.remove(Integer.parseInt(input[1]));
                        finalList.add(Integer.parseInt(input[1]), "Lost");

                        lostNames++;
                        System.out.printf("%s was lost due to an error.%n",lostGuy);
                    }

                }

            } else if (input[0].equals("Change")) {
                if (Integer.parseInt(input[1]) >= 0 && Integer.parseInt(input[1]) < finalList.size()) {
                    String changedGuy=finalList.get(Integer.parseInt(input[1]));
                    finalList.remove(Integer.parseInt(input[1]));
                    finalList.add(Integer.parseInt(input[1]), input[2]);
                    System.out.printf("%s changed his username to %s.%n", changedGuy, input[2]);

                }

            }
            if (check.equals("Report")) {
                System.out.printf("Blacklisted names: %d%n", blackListed);
                System.out.printf("Lost names: %d%n", lostNames);
                break;
            }

        }
        System.out.print(String.join(" ", finalList));
    }
}
