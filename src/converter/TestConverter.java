package src.converter;

import java.util.Scanner;

public class TestConverter {
    public static void main(String[] args) {
        int converterOption = 0;
        Scanner myObj = new Scanner(System.in);
       
        System.out.println("Enter '1' for weight converting, or '2' for temperature converting:");
        converterOption = myObj.nextInt();

        if (converterOption == 1) {
            System.out.println(" Enter a mass value:");
            double mass = myObj.nextDouble();
            System.out.println("Enter '1' for converting LB to KG, or '2' for converting KG to LB:");
            int choice = myObj.nextInt();
            switch (choice) {
                case 1:
                    System.out
                            .println(String.valueOf(mass) + "LB is " + Converter.getMass(mass, choice) + " KG");
                    break;
                case 2:
                    System.out
                            .println(String.valueOf(mass) + "KG is " + Converter.getMass(mass, choice) + " LP");
                    break;
                default:
                    System.err.println("Invalid Choice! Only 1 or 2 is allowed");
                    break;
            }

        } else if (converterOption == 2) {

            System.out.println(" Enter a temperature value:");
            double temp = myObj.nextDouble();
            System.out.println("Enter '1' for converting CS to FH, or '2' for converting FH to CS:");
            int choice = myObj.nextInt();
            switch (choice) {
                case 1:
                    System.out
                            .println(String.valueOf(temp) + "CS is " + Converter.getTemperature(temp, choice) + " FH");

                    break;
                case 2:
                    System.out
                            .println(String.valueOf(temp) + "FH is " + Converter.getTemperature(temp, choice) + " CS");
                    break;
                default:
                    System.err.println("Invalid Choice! Only 1 or 2 is allowed");
                    break;
            }

        }
    }
}
