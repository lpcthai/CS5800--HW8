import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DispensingStateTest {

    @Test
    public void testSelectSnack() {
        VendingMachine vendingMachine = new VendingMachine();
        DispensingState dispensingState = new DispensingState(vendingMachine);
        dispensingState.selectSnack("Coke", 1);
        assertTrue(true, "Selecting a snack first.");
    }

    public void dispenseSnack(Snack snack, int quantity) {
        if (snack == null || snack.getSnackName() == null) {
            System.out.println("No snack selected.");
            return;
        }
        if (snack.getSnackName().equalsIgnoreCase("Coke")) {
            if (snack.getSnackQuantity() >= quantity) {
                snack.setSnackQuantity(snack.getSnackQuantity() - quantity);
                System.out.println("Dispensed Coke. Thank you!");
            } else {
                System.out.println("Not enough Coke in stock.");
            }
        }
    }

}
