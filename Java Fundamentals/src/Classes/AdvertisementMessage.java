package Classes;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        String [] phrases={ "Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.","I can’t live without this product."};
        String [] events ={"Now I feel good.","I have succeeded with this product.","Makes miracles. I am happy of the results!","I cannot believe but now I feel awesome.","Try it yourself, I am very satisfied.","I feel great!"};
        String [] authors={"Diana","Petya","Stella","Elena","Katya","Iva","Annie","Eva"};
        String [] cities={"Burgas","Sofia","Plovdiv","Varna","Ruse"};
        Random rand = new Random();
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            int randPhrases = rand.nextInt(phrases.length);
            int randEvents = rand.nextInt(events.length);
            int randAuthors = rand.nextInt(authors.length);
            int randCities= rand.nextInt(cities.length);
            System.out.println(phrases[randPhrases]+" "+events[randEvents]+" "+authors[randAuthors]+" - "+cities[randCities]);
        }


    }
    
}
