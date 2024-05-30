package src.converter_pk;

public class TestConverter {
    public static void main(String[] args) {
        System.out.println("Celsius to Fahereiht:"+Converter.ConvertCLToFAH(10));
        System.out.println("Fahereits to Celsius:"+Converter.ConvertFAHToCL(10));
        System.out.println("Kilograms to Pounds:"+Converter.ConvertKGToLP(10));
        System.out.println("Pounds to Kilograms:"+Converter.ConvertLPToKG(10));
    }
}
