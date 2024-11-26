import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KitKatDispenseHandlerTest {

    @Test
    public void testKitKatDispensingFunctionality() {
        Snack kitKat = new Snack("KitKat", 1.99, 10);
        SnackDispenseHandler handler = new KitKatDispenseHandler(null);
        handler.dispenseSnack(kitKat, 5);
        assertEquals(5, kitKat.getSnackQuantity(),
                "the remaining stock should be 5.");
    }
}
