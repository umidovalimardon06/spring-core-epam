package springcontainer.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcontainer.xml.service.MyService;

public class Application {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("container-metadata.xml");
         MyService service = container.getBean("service",MyService.class);
         service.doStuff();
    }
}
