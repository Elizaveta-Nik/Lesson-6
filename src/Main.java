import java.util.Scanner;

import CreditCard.CreditCard;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double billCardOne = getStartValue(1, scanner);
        double billCardTwo = getStartValue(2, scanner);
        double billCardThree = getStartValue(3, scanner);


        CreditCard cardOne = new CreditCard(1, billCardOne);
        cardOne.billAmount();
        cardOne.billPlus(100);

        CreditCard cardTwo = new CreditCard(2, billCardTwo);
        cardTwo.billAmount();
        cardTwo.billPlus(10);

        CreditCard cardThree = new CreditCard(3, billCardThree);
        cardThree.billAmount();
        double currentBill = cardThree.billMinus(75);
        System.out.println("Остаток на счете " + currentBill);

        scanner.close();
    }

    static double getStartValue(int id, Scanner scanner) {
        double value;
        do {
            System.out.println("Введите положительную сумму счета для карты # " + id);

            value = scanner.nextDouble();
        }
        while (value < 0);

        return value;
    }
}