package converter_pk;

public class Converter {

    private static Converter converter= new Converter();


    public static float ConvertKGToLP(float kilogramsValue) {
        return converter.getPoundValue(kilogramsValue);
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

    private float getKilogramsValue(float poundsValue) {
        return 0;
    }

    private float getPoundValue(float kilogramsValue) {
        return (float) (kilogramsValue * 2.2046226218);
    }

    private float getFahenheitValue(float celciusValue) {
        return 0;
    }

    private float getCelciusValue(float fahenheitValue) {
        return 0;
    }
}