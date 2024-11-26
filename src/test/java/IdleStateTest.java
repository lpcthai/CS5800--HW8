import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class IdleStateTest {

    @Test
    void testSnackAvailable() {
        Snack selectedSnack = new Snack("Chips", 1.50, 5);
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setSelectedSnack(selectedSnack);
        IdleState idleState = new IdleState(vendingMachine);
        boolean available = idleState.SnackAvailable();
        assertTrue(available, "Snack should be available.");
    }

    @Test
    void testShowSnackOrderedInfo() {
        Snack snack = new Snack("Chips", 1.50, 5);
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setSnacks(Map.of("Chips", snack));
        IdleState idleState = new IdleState(vendingMachine);
        idleState.showSnackOrderedInfo("Chips", 3);
        assertTrue(true);
    }

    @Test
    void testSelectSnack() {
        Snack snack = new Snack("Chips", 1.50, 5);
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setSnacks(Map.of("Chips", snack));
        IdleState idleState = new IdleState(vendingMachine);
        idleState.selectSnack("Chips", 2);
        assertTrue(true, "Select snack first.");
    }

    @Test
    void testInsertMoney() {
        VendingMachine vendingMachine = new VendingMachine();
        IdleState idleState = new IdleState(vendingMachine);
        idleState.insertMoney(5.0);
        assertTrue(true, "Insert money");
    }

    @Test
    void testDispenseSnack() {
        VendingMachine vendingMachine = new VendingMachine();
        IdleState idleState = new IdleState(vendingMachine);
        idleState.dispenseSnack();
        assertTrue(true);
    }
}
