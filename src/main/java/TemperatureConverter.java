import java.util.Scanner;

public class TemperatureConverter {

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double kelvinToCelsius(double kelvin) {
        return (kelvin - 273.15);
    }

    static boolean isExtremeTemperature(double celsius) {

        if ((celsius < -40) || (celsius > 50)) {
//            System.out.printf("A temperature of celsius %.2f is considered extreme ", celsius);
//            System.out.println();
            return true;
        }
//        System.out.printf("Given temperature of celsius %.2f is normal.", celsius);
//        System.out.println();
        return false;
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Input: ");
//        double kelvin = Double.parseDouble((scanner.nextLine()));
//
//        System.out.printf("Output: %.2f°C ", kelvinToCelsius(kelvin));
//        System.out.println();
//        System.out.printf("Calculation: %f - 273.15 = %.2f", kelvin, kelvinToCelsius(kelvin));
//
//        System.out.println();
//        System.out.printf("celsius %.2f", fahrenheitToCelsius(100));
//        System.out.println();
//        System.out.printf("fahrenheit %.2f", celsiusToFahrenheit(1));
//        System.out.println();
//        System.out.println("");
//        double[] celsiusTemp = {20.0, -41.0, 49.0, 51};
//        for (double cel : celsiusTemp) {
//            if (isExtremeTemperature(cel)) {
//                System.out.printf("A temperature of celsius %.2f is considered extreme ", cel);
//                System.out.println();
//            }
//            else {
//                System.out.printf("Given temperature of celsius %.2f is normal.", cel);
//                System.out.println();
//            }
//        }
//    }
}
