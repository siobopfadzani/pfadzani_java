import java.util.Scanner;
public class DistanceCalculator {

    public void distanceCalculator(String distanceFromStore) {

        int meters = 1000;
        double miles = 0.621371;

        System.out.println("Distance in Mile: " + miles * Integer.parseInt(distanceFromStore) + "mi.");
        System.out.println("Distance in meters: " + meters * Integer.parseInt(distanceFromStore) + "m");

    }
}

