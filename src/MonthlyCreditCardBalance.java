import java.util.Scanner;

public class MonthlyCreditCardBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int cardBalance = 5000;
        double interestRate = 0.17;

        cardBalance += cardBalance * interestRate;
        System.out.println("The balance of the card after one month is $" + cardBalance);
        cardBalance += cardBalance * interestRate;
        System.out.println("The balance of the card after two months is $" + cardBalance);
    }
}