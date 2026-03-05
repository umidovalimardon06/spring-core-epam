package springcontainer.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springcontainer.java.service.Service;


public class Application {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("container-metadata.xml");
        Service service = container.getBean("service", Service.class);
        service.doStuff();
    }
}
