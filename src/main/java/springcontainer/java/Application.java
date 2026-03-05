package springcontainer.java;

import org.springframework.context.ApplicationContext;
import springcontainer.java.congif.ContainerMetadataConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springcontainer.java.service.MyService;

public class Application {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ContainerMetadataConfig.class);
        MyService service = container.getBean("service", MyService.class);
        service.doStuff();
    }
}
