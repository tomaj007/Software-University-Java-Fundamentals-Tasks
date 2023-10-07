package Arrays;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int intArray []= Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int num=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <num ; i++) {
            int firstNum=intArray[0];
            for (int j = 0; j < intArray.length; j++) {
                if(j+1<intArray.length)
                intArray[j]=intArray[j+1];
            }
            intArray[intArray.length-1]=firstNum;

        }
        for (int i:
             intArray) {
            System.out.print(i+" ");
        }
    }
}
