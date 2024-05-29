package converter_pk;

public class Converter {



    public static float ConvertKGToLP(float kilogramsValue) {
        return getPoundValue(kilogramsValue);
    }

    public static float ConvertLPToKG(float poundsValue) {
        return 0;
    }

    public static float ConvertCLToFAH(float celsiusValue) {
        return 0;
    }

    public static float ConvertFAHToCL(float fahrenheitValue) {
        return 0;
    }

    private static float getKilogramsValue(float poundsValue) {
        return 0;
    }

    private static float getPoundValue(float kilogramsValue) {
        return (float) (kilogramsValue * 2.2046226218);
    }

    private static float getFahenheitValue(float celciusValue) {
        return 0;
    }

    private static float getCelciusValue(float fahenheitValue) {
        return 0;
    }
}