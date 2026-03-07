package spring.wiring.qualifier.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import spring.wiring.qualifier.payment.service.interfaces.IPaymentService;

@Service
public class PaymentFacade {
    private final IPaymentService paymentService;

    @Autowired
    public PaymentFacade(@Qualifier("payPalImpl") IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void pay() {
        paymentService.pay();
    }

}
