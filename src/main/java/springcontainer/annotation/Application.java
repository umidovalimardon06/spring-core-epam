package springcontainer.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springcontainer.annotation.congif.ContainerMetadataConfig;
import springcontainer.annotation.service.MyService;

public class Application {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ContainerMetadataConfig.class);
        MyService service = container.getBean("serviceImp", MyService.class);
        service.doStuff();
    }
}
