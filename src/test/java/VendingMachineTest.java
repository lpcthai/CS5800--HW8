import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

public class VendingMachineTest {

    private VendingMachine vendingMachine;
    private Snack coke;
    private Snack chips;

    @BeforeEach
    public void setUp() {
        vendingMachine = new VendingMachine();
        coke = new Snack("Coke", 1.50, 10);
        chips = new Snack("Chips", 2.00, 5);
        Map<String, Snack> snacks = new HashMap<>();
        snacks.put("Coke", coke);
        snacks.put("Chips", chips);
        vendingMachine.setSnacks(snacks);
    }

    @Test
    public void testSelectSnack() {
        vendingMachine.selectSnack("Coke", 2);
        assertEquals(coke, vendingMachine.getSelectedSnack(), "Selected Coke");
        assertEquals(2, vendingMachine.getSelectedSnackQuantity(), "Selected 2 quantity .");
    }


    @Test
    public void testInsertMoney() {
        vendingMachine.selectSnack("Coke", 1);
        vendingMachine.insertMoney(2.00);
        assertEquals(2.00, vendingMachine.getInsertedMoney(), "Inserted money.");
    }

    @Test
    public void testResetTransaction() {
        vendingMachine.selectSnack("Coke", 2);
        vendingMachine.insertMoney(3.00);
        vendingMachine.resetTransaction();
        assertNull(vendingMachine.getSelectedSnack(), "Selected snack.");
        assertEquals(0, vendingMachine.getSelectedSnackQuantity(), "Selected quantity.");
        assertEquals(0.00, vendingMachine.getInsertedMoney(), "Inserted money.");
    }
}
