public class SnickerDispenseHandler extends SnackDispenseHandler {

    public SnickerDispenseHandler(SnackDispenseHandler handler){
        super(handler);
    }

    @Override
    public void dispenseSnack(Snack snack, int quantity){
        if(snack.getSnackName().equalsIgnoreCase("snickers")){
            System.out.println("Here is your: " + snack.getSnackName() + ". Thank you!");
            snack.setSnackQuantity(snack.getSnackQuantity() - quantity);
        }else{
            super.dispenseSnack(snack, quantity);
        }
    }
}