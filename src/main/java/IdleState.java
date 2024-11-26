public class IdleState implements StateOfVendingMachine{

    private final VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }


    public void showSnackOrderedInfo(String snackName, int quantity) {
        System.out.println(quantity + " " + snackName);
        System.out.println(snackName + " price: $" + String.format(
                "%.2f", vendingMachine.getSnacks().get(snackName).getSnackPrice()) + "/each");
    }
    public boolean SnackAvailable() {
        return vendingMachine.getSelectedSnack().getSnackQuantity() > 0;
    }


    public void selectSnack(String snackName, int quantity) {
        showSnackOrderedInfo(snackName, quantity);
        vendingMachine.setState(new WaitingForMoneyState(vendingMachine));
    }

    public void insertMoney(double userPaidAmount) {
        System.out.println("Please select a snack first.");
    }


    public void dispenseSnack() {
        System.out.println("Please select a snack first.");
    }
}
