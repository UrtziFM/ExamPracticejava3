public class ShipExceptions extends Exception{

    // Constructor
    public ShipExceptions(String mensaje) {
        
        super(mensaje);
    }

    public static int numberTransformation(String input) throws NumberFormatException {

        int number = Integer.parseInt(input);
        if(number < 0){
            throw new NumberFormatException("Negative numbers are not allowed.");
        }
        return number;
    }
    
}
