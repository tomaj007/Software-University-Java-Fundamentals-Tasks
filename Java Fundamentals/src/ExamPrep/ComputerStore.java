package ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double taxSum = 0;
        double noTaxSum = 0;
        double totalSum = 0;
        boolean isSpecial = false;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("special")) {
                isSpecial = true;
            }

            if (input.equals("special") || input.equals("regular")) {
                break;
            }

            double price = Double.parseDouble(input);
            if (price > 0) {
                taxSum += price * 0.2;
                noTaxSum += price;
                totalSum += price * 0.2 + price;
            } else
                System.out.println("Invalid price!");
        }


        if (isSpecial) {
            totalSum = totalSum - totalSum * 0.1;
        }
        if (totalSum == 0) {
            System.out.println("Invalid order!");
        }else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", noTaxSum);
            System.out.printf("Taxes: %.2f$%n", taxSum);
            System.out.println("-----------");
            System.out.printf("Total price: %.2f$%n", totalSum);
        }
    }
}
