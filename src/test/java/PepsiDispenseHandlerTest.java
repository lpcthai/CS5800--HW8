import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PepsiDispenseHandlerTest {

    @Test
    public void testDispensePepsi() {
        Snack pepsi = new Snack("Pepsi", 1.50, 10);
        SnackDispenseHandler handler = new PepsiDispenseHandler(null);
        handler.dispenseSnack(pepsi, 3);
        assertEquals(7, pepsi.getSnackQuantity(),
                "the remaining stock should be 7.");
    }
}
