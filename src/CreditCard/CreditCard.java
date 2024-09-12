package CreditCard;

public class CreditCard {

    public long cardNumber;
    public double currentAmount;

    public CreditCard(long cardNumber, double currentAmount) {
        this.cardNumber = cardNumber;
        this.currentAmount = currentAmount;
    }

    public void billAmount() {
        System.out.println("Баланс на счету: " + currentAmount + " Номер счета: " + cardNumber);
    }

    public void billPlus(double balance) {
        currentAmount += balance;
        System.out.println("Баланс на счету после начисления: " + currentAmount + " Номер счета: " + cardNumber);
    }

    public double billMinus(double currentBill) {
        if (currentAmount > currentBill) {
            currentAmount -= currentBill;
            System.out.println("Баланс на счету после списания: " + currentAmount + " Номер счета: " + cardNumber);
            return currentAmount;
        } else {
            System.out.println("Недопустимая сумма для снятия. Счет не может быть отрицательным.");
            return currentAmount;
        }
    }
}

