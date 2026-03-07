package spring.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.scopes.beans.PrototypeBean;
import spring.scopes.beans.SingletonBean;
import spring.scopes.config.ContainerMetadata;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContainerMetadata.class);

        prototypeScopeTest(context);
        singletonScopeTest(context);


    }

    private static void singletonScopeTest(ApplicationContext context) {
        for (int i = 1; i <= 10; i++) {
            context.getBean(SingletonBean.class).revealMemoryAddress();
        }
    }

    private static void prototypeScopeTest(ApplicationContext context) {
        for (int i = 1; i <= 10; i++) {
            /*context.getBean(SingletonBean.class).revealMemoryAddress();*/
            context.getBean(PrototypeBean.class).revealMemoryAddress();
        }
    }
}
