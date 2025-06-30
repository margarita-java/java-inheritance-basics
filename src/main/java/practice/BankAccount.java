package practice;

public class BankAccount {

  protected double balance;

  public double getAmount() {

    return balance;
  }

  public void put(double amountToPut) {

    if (amountToPut > 0) {
      balance += amountToPut;
    }
  }

  public void take(double amountToTake) {

    if (amountToTake > 0 && amountToTake <= balance) {
      balance -= amountToTake;
    }
  }
}

