import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SnackDispenseHandlerTest {

    @Test
    public void testDispenseSnack() {
        Snack snack = new Snack("Chips", 1.50, 10);
        SnackDispenseHandler handler = new SnackDispenseHandler(null) {
            @Override
            public void dispenseSnack(Snack snack, int quantity) {
                if (snack.getSnackQuantity() >= quantity) {
                    snack.setSnackQuantity(snack.getSnackQuantity() - quantity);
                } else {
                    System.out.println("Out of stock: " + snack.getSnackName());
                }
            }
        };

        handler.dispenseSnack(snack, 3);
        assertEquals(7, snack.getSnackQuantity(),
                "the remaining stock should be 7.");
    }
}
