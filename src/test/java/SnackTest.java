import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SnackTest {

    @Test
    public void testSnack() {
        String snackName = "Chips";
        double snackPrice = 1.99;
        int snackQuantity = 10;
        Snack snack = new Snack(snackName, snackPrice, snackQuantity);
        assertEquals(snackName, snack.getSnackName());
        assertEquals(snackPrice, snack.getSnackPrice());
        assertEquals(snackQuantity, snack.getSnackQuantity());
    }

    @Test
    public void testSetSnackQuantity() {
        Snack snack = new Snack("Chips", 1.99, 10);
        int newQuantity = 20;
        snack.setSnackQuantity(newQuantity);
        assertEquals(newQuantity, snack.getSnackQuantity(), "Update Snack quantity.");
    }

}
