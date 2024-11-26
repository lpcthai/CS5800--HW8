import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SnickerDispenseHandlerTest {

    @Test
    public void testDispenseSnickers() {
        Snack snickers = new Snack("Snickers", 1.75, 10);
        SnackDispenseHandler handler = new SnickerDispenseHandler(null);
        handler.dispenseSnack(snickers, 4);
        assertEquals(6, snickers.getSnackQuantity(),
                "the remaining stock should be 6.");
    }
}
