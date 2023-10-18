package ExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targets = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("End")) {
                break;
            }
            String coms[] = input.split(" ");
            int index = Integer.parseInt(coms[1]);
            int power = Integer.parseInt(coms[2]);
            switch (coms[0]) {
                case "Shoot":
                    if (index >= 0 && index < targets.size()) {
                        targets.set(index, targets.get(index) - power);
                        if (targets.get(index) <= 0) {

                            targets.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (index >= 0 && index < targets.size()) {
                        targets.add(index, power);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    if ((index + power >= 0 && index + power < targets.size()) && (index - power >= 0 && index - power < targets.size())) {

                        int count = power * 2 + 1;
                        for (int i = 0; i < count; i++) {
                            targets.remove(index - power);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }

        }
        System.out.println(String.join("|", targets.stream().map(String::valueOf).collect(Collectors.toList())));
    }
}

