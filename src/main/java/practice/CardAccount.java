package practice;

public class CardAccount extends BankAccount {

    @Override
    public void take(double amountToTake) {
        double amountWithCommission = amountToTake * 1.01;
        if (amountWithCommission > 0 && amountWithCommission <= balance) {
            balance -= amountWithCommission;
        }
    }
}
