import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoritosDispenseHandlerTest {

    @Test
    public void testDoritosDispenserHandler() {
        Snack doritos = new Snack("Doritos", 2.50, 10);
        SnackDispenseHandler handler = new DoritosDispenseHandler(null);
        handler.dispenseSnack(doritos, 5);
        assertEquals(5, doritos.getSnackQuantity(),
                "the remaining stock should be 5.");
    }
}
