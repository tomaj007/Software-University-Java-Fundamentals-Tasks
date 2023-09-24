import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double grade= input.nextDouble();
        if(grade>=3.00 )
            System.out.println("Passed!");
        else System.out.println("Failed!");
    }
}
