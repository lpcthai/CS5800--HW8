
public class WaitingForMoneyState implements StateOfVendingMachine{
    private final VendingMachine vendingMachine;

    public WaitingForMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }


    public void selectSnack(String snackName, int quantity) {
        System.out.print("You can't select another snack until you pay for your current snack.\n");
    }

    public void insertMoney(double amount) {
        double snackPrice = vendingMachine.getSelectedSnack().getSnackPrice();
        double userSnackQuantity = vendingMachine.getSelectedSnackQuantity();
        double actualSnackQuantity = vendingMachine.getSelectedSnack().getSnackQuantity();
        double totalCost = snackPrice * userSnackQuantity;
        vendingMachine.addInsertedMoney(amount);
        System.out.printf("You inserted: $%.2f%n", amount);


        if (amount < totalCost){
            System.out.println("Not enough money inserted. Money ejected");
            vendingMachine.setState(new IdleState(vendingMachine));
            return;
        } else if(actualSnackQuantity < userSnackQuantity) {
            System.out.printf("Not enough %s in the machine. Money ejected\n", vendingMachine.getSelectedSnack().getSnackName());
            vendingMachine.setState(new IdleState(vendingMachine));
            return;
        } else if(amount > totalCost){
            double returnAmount = amount - totalCost;
            System.out.printf("Your change: $%.2f is returned.\n", returnAmount);
        }
    }

    @Override
    public void dispenseSnack() {
        System.out.println("You need to pay first");
    }
}
