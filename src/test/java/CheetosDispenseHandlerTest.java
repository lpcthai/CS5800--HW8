import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheetosDispenseHandlerTest {

    @Test
    public void testDispenseCheetos() {
        Snack cheetos = new Snack("Cheetos", 1.99, 10);
        SnackDispenseHandler handler = new CheetosDispenseHandler(null);
        handler.dispenseSnack(cheetos, 4);
        assertEquals(6, cheetos.getSnackQuantity(),
                "The remaining stock should be 6.");
    }
}
