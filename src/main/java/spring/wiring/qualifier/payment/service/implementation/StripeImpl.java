package spring.wiring.qualifier.payment.service.implementation;

import org.springframework.stereotype.Component;
import spring.wiring.qualifier.payment.service.interfaces.IPaymentService;

@Component
public class StripeImpl implements IPaymentService {
    @Override
    public void pay() {
        System.out.println("(Stripe)::paid");
    }
}
