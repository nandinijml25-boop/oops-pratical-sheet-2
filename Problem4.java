import java.util.Scanner;

class Payment {
    void pay(int amount) {}
}

class CreditCard extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Payment method: Credit Card");
        System.out.println("Amount: " + amount);
    }
}

class UPI extends Payment {
    @Override
    void pay(int amount) {
        System.out.println("Payment method: UPI");
        System.out.println("Amount: " + amount);
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int method = sc.nextInt();
        int amount = sc.nextInt();

        Payment payment = (method == 1) ? new CreditCard() : new UPI();
        payment.pay(amount);
    }
}