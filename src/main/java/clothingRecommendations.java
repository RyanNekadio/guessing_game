import java.util.Scanner;

public class clothingRecommendations {

    public static void main(String[] args){

        System.out.println("Welcome to Ryan's Clothing Recommendations App!");

        System.out.println("Please state what the weather is like today?");

        Scanner reader = new Scanner(System.in);

        String weather = reader.nextLine();

        System.out.println("Please state the average temperature of the day");

        int temperature = reader.nextInt();

        if ((weather.equals("snow") && temperature <= 2) ||
                (weather.equals("cloudy") && temperature <= 2) ||
                (weather.equals("blizzard") && temperature <= 2)) {
            System.out.println("Wear a waterproof winter coat!");
        } else if ((weather.equals("cloudy") && (temperature > 2 && temperature < 8)) ||
                (weather.equals("rainy") && (temperature > 2 && temperature < 8)) ||
                (weather.equals("sunny") && (temperature > 2 && temperature < 8))) {
            System.out.println("Wear a waterproof winter coat!");
        } else if (weather.equals("sunny") && temperature >= 24 ){
            System.out.println("Wear a summer shirt and shorts!");
        } else {
            System.out.println("Caution! Please seek more information on today's weather!");
        }
    }

}
