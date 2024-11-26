
public class KitKatDispenseHandler extends SnackDispenseHandler {

    public KitKatDispenseHandler(SnackDispenseHandler handler){
        super(handler);
    }

    @Override
    public void dispenseSnack(Snack snack, int quantity){
        if(snack.getSnackName().equalsIgnoreCase("kitkat")){
            System.out.println("Here is your: " + snack.getSnackName() + ". Thank you!");
            snack.setSnackQuantity(snack.getSnackQuantity() - quantity);
        }else{
            super.dispenseSnack(snack, quantity);
        }
    }

}
