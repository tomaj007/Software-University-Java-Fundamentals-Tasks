package Exam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.valueOf;

public class Second2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> finalList = Arrays.stream(scanner.nextLine().split(">>"))
                .map(String::trim)
                .collect(Collectors.toList());
        double sum = 0;
        for (int i = 0; i < finalList.size(); i++) {
            String[] properties = finalList.get(i).split(" ");
            if (properties[0].equals("family")) {
                double tax = 0;
                tax += 50;
                tax -= valueOf(properties[1]) * 5;
                int taxKilometres = valueOf(properties[2]) / 3000;
                tax += taxKilometres * 12;
                sum += tax;

                System.out.printf("A %s car will pay %.2f euros in taxes.%n", properties[0], tax);
            } else if (properties[0].equals("heavyDuty")) {
                double tax = 0;
                tax += 80;
                tax -= valueOf(properties[1]) * 8;
                int taxKilometres = valueOf(properties[2]) / 9000;
                tax += taxKilometres * 14;
                sum += tax;
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", properties[0], tax);
            } else if (properties[0].equals("sports")) {
                double tax = 0;
                tax += 100;
                tax -= valueOf(properties[1]) * 9;
                int taxKilometres = valueOf(properties[2]) / 2000;
                tax += taxKilometres * 18;
                sum += tax;
                System.out.printf("A %s car will pay %.2f euros in taxes.%n", properties[0], tax);
            } else {
                System.out.println("Invalid car type");
            }
        }
        System.out.printf("The National Revenue Agency will collect %.2f euros in taxes.", sum);

    }
}
