package spring.scopes.beans;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableListableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean {
    public void revealMemoryAddress(){
        System.out.println(System.identityHashCode(this));
    }
}





