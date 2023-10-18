package ExamPrep;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoins = 0;
        String rooms[] = scanner.nextLine().split("\\|");
        for (int i = 0; i < rooms.length; i++) {
            String params[] = rooms[i].split(" ");
            String command = params[0];
            int number = Integer.parseInt(params[1]);
            if (command.equals("potion")) {
                int healthBefore = health;
                health += number;
                if (health <= 100) {
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);
                } else {
                    health = 100;
                    System.out.printf("You healed for %d hp.%n", health - healthBefore);
                    ;
                    System.out.printf("Current health: %d hp.%n", health);
                }
            } else if (command.equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);
            } else {
                health -= number;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", i+1);
                    break;
                }
            }
        }
        if (health > 0) {
            System.out.printf("You've made it!%n");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}