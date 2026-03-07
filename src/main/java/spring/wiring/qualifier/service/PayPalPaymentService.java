package spring.wiring.qualifier.service;

public class PayPalPaymentService implements PaymentService{
    @Override
    public void pay() {
        System.out.println("(PayPal)::paid");
    }
}
