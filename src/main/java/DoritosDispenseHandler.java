public class DoritosDispenseHandler extends SnackDispenseHandler {
    public DoritosDispenseHandler(SnackDispenseHandler handler){
        super(handler);
    }

    public void dispenseSnack(Snack snack, int quantity){
        if(snack.getSnackName().equalsIgnoreCase("Doritos") &&
                snack.getSnackQuantity() > quantity){
            System.out.println("Here is your: " + snack.getSnackName() + ". Thank you!");
            snack.setSnackQuantity(snack.getSnackQuantity() - quantity);
        }else{
            super.dispenseSnack(snack, quantity);
        }
    }
}