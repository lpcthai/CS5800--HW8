public class DispensingState implements StateOfVendingMachine{

    private final VendingMachine vendingMachine;
    private final SnackDispenseHandler snackDispenseHandler;

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
        snackDispenseHandler = new CokeDispenseHandler(
                new PepsiDispenseHandler(new CheetosDispenseHandler(
                        new DoritosDispenseHandler(new KitKatDispenseHandler(new SnickerDispenseHandler(null))))));
    }


    public void selectSnack(String snackName, int quantity) {
        System.out.println("You can't select another snack until you receive your snack.");
    }


    public void insertMoney(double amount) {
        System.out.println("You can't insert another coin until you receive your snack.");
    }


    public void dispenseSnack() {
        snackDispenseHandler.dispenseSnack(vendingMachine.getSelectedSnack(), vendingMachine.getSelectedSnackQuantity());
        vendingMachine.setState(new IdleState(vendingMachine));
    }

}
