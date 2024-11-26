import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CokeDispenseHandlerTest {

    @Test
    public void testDispenseCoke() {
        Snack coke = new Snack("Coke", 1.50, 10);
        SnackDispenseHandler handler = new CokeDispenseHandler(null);
        handler.dispenseSnack(coke, 4);
        assertEquals(6, coke.getSnackQuantity(),
                "The remaining stock should be 6.");
    }
}
