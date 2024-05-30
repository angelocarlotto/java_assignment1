package converter_pk;

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

    /*
     * public static double ConvertKGToLP(double kilogramsValue) {
     * return getPoundValue(kilogramsValue);
     * }
     * 
     * public static double ConvertLPToKG(double poundsValue) {
     * return 0;
     * }
     * 
     * public static double ConvertCLToFAH(double celsiusValue) {
     * return 0;
     * }
     * 
     * public static double ConvertFAHToCL(double fahrenheitValue) {
     * return 0;
     * }
     */
    private static double getKilogramsValue(double poundsValue) {
        return 0;
    }

    private static double getPoundValue(double kilogramsValue) {
        return kilogramsValue * 2.2046226218;
    }

    private static double getFahenheitValue(double celciusValue) {
        return 0;
    }

    private static double getCelciusValue(double fahenheitValue) {
        return 0;
    }
}