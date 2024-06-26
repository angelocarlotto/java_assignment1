package src.converter;

public class Converter {

    /**
     * 
     * @param value
     * @param option 1 will return Fahenheit, 2 will return Celsius
     * @return
     */
    public static double getTemperature(double value, int option) {
        double tempResult = 0;
        switch (option) {
            case 1:
                tempResult = getFahenheitValue(value);
                break;
            case 2:
                tempResult = getCelciusValue(value);
                break;
            default:
                System.err.println("Invalid Choice! Only 1 or 2 is allowed");
        }

        return tempResult;
    }

    /**
     * 
     * @param value
     * @param option 1 will return Kilograms, 2 will return Pounds
     * @return
     */
    public static double getMass(double value, int option) {
        double massResult = 0;
        switch (option) {
            case 1:
                massResult = getKilogramsValue(value);
                break;
            case 2:
                massResult = getPoundValue(value);
                break;
            default:
                System.err.println("Invalid Choice! Only 1 or 2 is allowed");
        }
        return massResult;
    }

    private static double getKilogramsValue(double poundsValue) {
        return poundsValue / 2.2;
    }

    private static double getPoundValue(double kilogramsValue) {
        return kilogramsValue * 2.2;
    }

    private static double getFahenheitValue(double celciusValue) {
        return ((celciusValue * 9) / 5) + 32;
    }

    private static double getCelciusValue(double fahenheitValue) {
        return (fahenheitValue - 32) * 5 / 9;
    }

}