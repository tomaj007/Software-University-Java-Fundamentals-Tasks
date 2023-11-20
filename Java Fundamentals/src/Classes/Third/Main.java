package Classes.Third;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int input=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <input ; i++) {
            String details=scanner.nextLine();
            String arr[]=details.split(" ");
            if(Integer.valueOf(arr[1])>30){
                Person person=new Person(arr[0],Integer.valueOf(arr[1]));
                System.out.println(  person.toString());
            }
        }
    }
}
