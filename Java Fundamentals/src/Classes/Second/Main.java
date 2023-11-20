package Classes.Second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Article article = new Article(input[0], input[1], input[2]);
        int i = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < i; j++) {
            String[] input1 = scanner.nextLine().split(": ");

            if (input1[0].equals("Edit")) {
              article.setContent(input1[1]);
            } else if (input1[0].equals("ChangeAuthor")) {
                article.setAuthor(input1[1]);

            } else if (input1[0].equals("Rename")) {
                article.setTitle(input1[1]);

            }
        }
        System.out.println(article.toString());
    }
}