
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int receipt = 300;
        int bonus = receipt / 100;
        if (receipt > 999) {
            balance = balance + receipt + bonus;
        } else {
            balance = balance + receipt;
            bonus = 0;
        }


        System.out.println("Начислено средств:" + receipt);
        System.out.println("Баланс:" + balance);
        System.out.println("Начислено бонусов:" + bonus);


    }
}