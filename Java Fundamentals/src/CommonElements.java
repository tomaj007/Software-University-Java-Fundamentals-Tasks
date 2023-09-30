import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String firstLine=scanner.nextLine();
        String secondLine2=scanner.nextLine();
        String firstLRow []= firstLine.split(" ");
        String secondLRow []= secondLine2.split(" ");
        for (String a:firstLRow) {
            for (String b:secondLRow ){
                if(a.equals(b)) {
                    System.out.print(a + " ");
                }
            }
        }
    }
}
