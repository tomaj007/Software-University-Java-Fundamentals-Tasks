import java.util.Date;
import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours= input.nextInt();
        int minutes= input.nextInt();
        minutes +=30;
        if(minutes>59){
            hours+=1;
            minutes-=60;
        }
        if(hours>23){
            hours= 0;
        }
        if(minutes<10)
        System.out.println(hours+":0"+minutes);
        else System.out.println(hours+":"+minutes);
    }
}