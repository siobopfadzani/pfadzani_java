public class MilesCalculator {
    public static double calculateMiles(String distance) {
        double miles = Double.parseDouble(distance);
        double conversion = 0.621371;
        return miles * conversion;
    }
}

