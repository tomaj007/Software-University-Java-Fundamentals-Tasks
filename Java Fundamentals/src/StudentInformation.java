import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        String name;
        int age;
        double grade;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        age = input.nextInt();
        grade = input.nextDouble();
        System.out.print("Name: " + name + ", Age: " + age + ", Grade: " + String.format("%.2f", grade));


    }
}
