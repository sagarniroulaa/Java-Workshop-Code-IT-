package day8.abstract_classes;

abstract class Payment {
    abstract void pay();
}

class CreditCardPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Paid with credit card.");
    }
}

class WalletPayment extends Payment {
    @Override
    void pay() {
        System.out.println("Paid with a wallet.");
    }
}

public class PolymorphismAndAbstractClassDemo {
    public static void main(String[] args) {

        Payment p;
        p = new CreditCardPayment();
        p.pay();

        p = new WalletPayment();
        p.pay();
    }
}
