package src.converter_pk;

public class TestConverter {
    public static void main(String[] args) {
        System.out.println("Celsius to Fahereiht:"+Converter.getTemperature(10,1));
        System.out.println("Fahereits to Celsius:"+Converter.getTemperature(10,2));
        System.out.println("Kilograms to Pounds:"+Converter.getMass(10,2));
        System.out.println("Pounds to Kilograms:"+Converter.getMass(10,1));
    }
}
