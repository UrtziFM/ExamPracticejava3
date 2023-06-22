public class SpaceShip extends SpaceShipAbstract {

    private int numberOfPassengers;

    // Constructor
    public SpaceShip() {
        // Empty constructor
    }

    public void fly(){

        numberOfPassengers = 0;
        
        try {
            for (int i = 0; i < 11; i++) {
                System.out.println("Passenger " + i + " IN!");
                if (i == 10) {
                    numberOfPassengers = i;
                    System.out.println("Passenger " + numberOfPassengers + "OUT!");
                    throw new ArithmeticException();
                }
            }   
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed.");
        }
    }
    
}