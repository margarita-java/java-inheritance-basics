package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private LocalDate lastIncome;

    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0) {
            balance += amountToPut;
            lastIncome = LocalDate.now();
        }
    }

    @Override
    public void take(double amountToTake) {
        if (amountToTake > 0 && amountToTake <= balance) {
            LocalDate currentData = LocalDate.now();
            if (lastIncome == null || lastIncome.plusMonths(1).isBefore(currentData)) {
                balance -= amountToTake;
            }
        }
    }
}

