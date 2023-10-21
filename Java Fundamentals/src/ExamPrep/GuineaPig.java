package ExamPrep;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double food = scanner.nextDouble();
        double hay = scanner.nextDouble();
        double cover = scanner.nextDouble();
        double weight = scanner.nextDouble();
        int counter = 0;
        int counter2 = 0;
        for (int i = 0; i < 30; i++) {
            food -= 0.3;
            counter++;
            counter2++;
            if (counter == 2) {
                double hayToGive = food * 0.05;
                hay -= hayToGive;
                counter = 0;
            }
            if (counter2 == 3) {
                double coverToGive = weight / 3;
                cover -= coverToGive;
                counter2 = 0;
            }
            if (food <= 0 || hay <= 0 || cover <= 0) {
                System.out.println("Merry must go to the pet store!");
                break;
            }
        }
        if (food <= 0 || hay <= 0 || cover <= 0) {

        } else
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", food, hay, cover);

    }

}

