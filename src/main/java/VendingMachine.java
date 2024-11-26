import java.util.HashMap;
import java.util.Map;
public class VendingMachine {
    private StateOfVendingMachine state;
    private Map<String, Snack> snacks;
    private Snack userSelectedSnack;
    private int userSelectedSnackQuantity;
    private double insertedMoney;
    public VendingMachine() {
        state = new IdleState(this);
        snacks = new HashMap<>();
        insertedMoney = 0;
    }
    public void setSnacks(Map<String, Snack> snacks) {
        this.snacks = snacks;
    }
    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }
    public StateOfVendingMachine getState() {
        return state;
    }
    public void selectSnack(String snackName, int quantity) {
        if (quantity <= 0) {
            System.out.println("Please select a valid quantity.");
            return;
        }

        if (!snacks.containsKey(snackName)) {
            System.out.println("Snack not available.");
            return;
        }

        Snack selectedSnack = snacks.get(snackName);
        if (selectedSnack.getSnackQuantity() < quantity) {
            System.out.printf("Not enough stock for %s. Available: %d.%n", snackName, selectedSnack.getSnackQuantity());
            return;
        }

        userSelectedSnack = selectedSnack;
        userSelectedSnackQuantity = quantity;
        System.out.printf("%d %s selected. Price: $%.2f each. Total: $%.2f.%n",
                quantity, snackName, selectedSnack.getSnackPrice(), selectedSnack.getSnackPrice() * quantity);


        state = new WaitingForMoneyState(this);
    }

    public void insertMoney(double amount) {
        if (amount <= 0) {
            System.out.println("Please insert a valid amount.");
            return;
        }
        state.insertMoney(amount);
    }

    public void dispenseSnack() {
        state.dispenseSnack();
    }

    public void addInsertedMoney(double amount) {
        insertedMoney += amount;
    }

    public double getInsertedMoney() {
        return insertedMoney;
    }

    public void resetInsertedMoney() {
        insertedMoney = 0;
    }

    public void resetTransaction() {
        userSelectedSnack = null;
        userSelectedSnackQuantity = 0;
        resetInsertedMoney();
    }

    public Map<String, Snack> getSnacks() {
        return snacks;
    }

    public Snack getSelectedSnack() {
        return userSelectedSnack;
    }

    public int getSelectedSnackQuantity() {
        return userSelectedSnackQuantity;
    }

    public void setSelectedSnack(Snack selectedSnack) {
        userSelectedSnack = selectedSnack;
        userSelectedSnackQuantity = selectedSnack.getSnackQuantity();

    }
}
