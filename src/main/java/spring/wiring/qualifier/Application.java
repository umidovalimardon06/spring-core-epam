package spring.wiring.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.wiring.qualifier.payment.config.ContainerConfiguration;
import spring.wiring.qualifier.payment.service.PaymentFacade;

public class Application {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ContainerConfiguration.class);
        PaymentFacade paymentFacade = container.getBean(PaymentFacade.class);
        paymentFacade.pay();
    }
}
