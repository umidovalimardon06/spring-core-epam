package spring.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.di.setter.config.containerMetadataConfig;
import spring.di.setter.service.ClientFriendlyInterface;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(containerMetadataConfig.class);
        ClientFriendlyInterface springManagedBean = context.getBean(ClientFriendlyInterface.class);
        System.out.println(springManagedBean.callSort());
    }
}
