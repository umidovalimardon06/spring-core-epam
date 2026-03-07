package spring.di.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.di.constructor.config.containerMetadataConfig;
import spring.di.constructor.service.ClientFriendlyInterface;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(containerMetadataConfig.class);
        ClientFriendlyInterface springManagedBean = context.getBean(ClientFriendlyInterface.class);
        System.out.println(springManagedBean.callSort());
    }
}
