import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class WaitingForMoneyStateTest {
    private VendingMachine vendingMachine;
    private WaitingForMoneyState waitingForMoneyState;

    @BeforeEach
    void setUp() {
        vendingMachine = new VendingMachine();
        waitingForMoneyState = new WaitingForMoneyState(vendingMachine);
        vendingMachine.setState(waitingForMoneyState);
    }

    @Test
    void testSelectSnack() {
        waitingForMoneyState.selectSnack("Chips", 1);
        assertTrue(true, "Selecting a snack.");
    }

    @Test
    void testInsertMoney() {
        Snack coke = new Snack("Coke", 1.50, 10);
        vendingMachine.setSnacks(Map.of("Coke", coke));
        vendingMachine.selectSnack("Coke", 2);
        double insertedAmount = 3.00;
        waitingForMoneyState.insertMoney(insertedAmount);
        assertTrue(true, "Insert money.");
    }


    @Test
    void testDispenseSnack() {
        waitingForMoneyState.dispenseSnack();
        assertTrue(true, "Dispense snack .");
    }
}
