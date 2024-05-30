package converter_pk;

public class TestConverter {
    public static void main(String[] args) {
        System.out.println("Celsius to Fahereiht:" + Converter.getTemperature(10, 1));
        System.out.println("Fahereits to Celsius:" + Converter.getTemperature(10, 2));
        System.out.println("Kilograms to Pounds:" + Converter.getMass(10, 2));
        System.out.println("Pounds to Kilograms:" + Converter.getMass(10, 1));

        // Ask the user:// to enter '1' for weight converting, or '2' for temperature
        // converting:// Save the user's choice/input:// Main if Block:If(choiceis1){//
        // this choice for calculating the mass (weight)// Ask the user to input a
        // mass/weight value// Ask the user to input 1 for... or 2 for.../** Build the
        // switch statement with 3 cases:* Case 1 => for getting the KG value* Case 2 =>
        // for getting the LB value* Default => Output a warning/error
        // message*/}elseif(choiceis2){// this choice for calculating the temperature//
        // Ask the user to input a temperature value// Ask the user to input 1 for... or
        // 2 for.../** Build the switch statement with 3 cases:* Case1 => for getting
        // the F temp value* Case 2 => for getting the C temp value* Default=> Output a
        // warning/error message*/}else{// output a simple message to show that the
        // user’s input was invalid}(30Marks)Happy Coding ☺
    }
}
