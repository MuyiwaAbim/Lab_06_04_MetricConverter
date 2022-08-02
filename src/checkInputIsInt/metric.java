package checkInputIsInt;
import java.util.Scanner;

public class metric {
    static double meters;
    static double miles;
    static double feet;
    static double inches;




    public static void main(String[] args) {
        System.out.println("What is the measurement in meters?");
        Scanner meter = new Scanner(System.in);
        if (meter.hasNextDouble()) {
            meters = meter.nextDouble();
        }
        else {
            System.out.println("Invalid Input");
        }

        double miles = meters / 1609.344;
        double feet = meters / 0.305;
        double inches = meters / 0.0254;

        System.out.println(meters + " meters in miles is " + miles + " miles.");
        System.out.println(meters + " meters in feet is " + feet + " feet.");
        System.out.println(meters + " meters in inches is " + inches + " inches.");

    }

}