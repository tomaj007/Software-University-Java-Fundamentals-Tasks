package Exam;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerPerson = Double.parseDouble(scanner.nextLine())*players*n;
        double foodPerPerson = Double.parseDouble(scanner.nextLine())*players*n;
        int counter = 0;
        int counter2 = 0;
        for (int i = 0; i < n; i++) {
            double energyLoss = Double.parseDouble(scanner.nextLine());
            energy -= energyLoss;
            if (energy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", foodPerPerson, waterPerPerson);
                break;
            }
            counter++;
            counter2++;
            if (counter == 2) {
                energy += energy * 0.05;
                waterPerPerson -= waterPerPerson * 0.3;
                counter = 0;
            }
            if (counter2 == 3) {
                foodPerPerson -= foodPerPerson / players;
                energy += energy * 0.1;
                counter2 = 0;
            }

        }
        if (energy > 0) {
            System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);
        }
    }
}