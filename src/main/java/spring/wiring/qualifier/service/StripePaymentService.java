package spring.wiring.qualifier.service;

public class StripePaymentService implements PaymentService{
    @Override
    public void pay() {
        System.out.println("(Stripe)::paid");
    }
}
