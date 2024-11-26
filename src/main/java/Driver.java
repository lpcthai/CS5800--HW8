import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Driver {
    public static <Hash> void main(String[] args) {
        Map<String, Snack> snacks = createSnacks();
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setSnacks(snacks);

        vendingMachine.selectSnack("Coke", 2);
        vendingMachine.insertMoney(10);
        vendingMachine.dispenseSnack();

        vendingMachine.selectSnack("Cheetos", 4);
        vendingMachine.insertMoney(10);
        vendingMachine.dispenseSnack();
        System.out.println();

        System.out.println();
        vendingMachine.selectSnack("Doritos", 1);
        vendingMachine.insertMoney(2.5);
        vendingMachine.dispenseSnack();

        System.out.println();
        vendingMachine.selectSnack("Snickers", 3);
        vendingMachine.insertMoney(10);

        System.out.println();
        vendingMachine.selectSnack("Snickers", 2);
        vendingMachine.insertMoney(2.5);
        vendingMachine.dispenseSnack();

        System.out.println();
        vendingMachine.selectSnack("Snickers", 1);
        vendingMachine.insertMoney(1.15);

        vendingMachine.selectSnack("KitKat", 2);
        vendingMachine.insertMoney(5);
        vendingMachine.dispenseSnack();
        System.out.println();
    }

    public static Map<String, Snack> createSnacks(){
        Map<String, Snack> snacks = new HashMap<String, Snack>();
        snacks.put("Coke", new Snack("Coke", 1.00, 2));
        snacks.put("Pepsi", new Snack("Pepsi", 0.99, 3));
        snacks.put("Cheetos", new Snack("Cheetos", 2.25, 3));
        snacks.put("Doritos", new Snack("Doritos", 2.50, 3));
        snacks.put("KitKat", new Snack("KitKat", 1.25, 2));
        snacks.put("Snickers", new Snack("Snickers", 1.15, 2));


        return snacks;
    }
}