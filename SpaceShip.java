import java.util.Scanner;

public class SpaceShip extends SpaceShipAbstract {

    private String numberOfPassengers;

    // Constructor
    public SpaceShip() {
        // Empty constructor
    }

    public void fly(){

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please enter an integer number: ");
            numberOfPassengers = scanner.nextLine();
        
            try {
                int num = ShipExceptions.numberTransformation(numberOfPassengers);
                for (int i = 0; i < num + 1; i++) {
                    System.out.println("Passenger " + i + " IN!");
                    if (i == num) {
                        System.out.println("Sorry but finally Passenger " + numberOfPassengers + " OUT!");
                        throw new IllegalStateException();
                    }
                }   
            } catch (NumberFormatException e) {
                System.out.println("Exception caught: " + e);
            } catch (IllegalStateException e) {
                System.out.println("Exception caught: " + "Passenger " + numberOfPassengers + " OUT!  The ship is full.");
            } finally {
                System.out.println("Finally block executed.");
            }
        }
    }
    
}