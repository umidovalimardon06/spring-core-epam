package springcontainer.java.congif;

import org.springframework.context.annotation.Bean;
import springcontainer.java.service.MyService;
import springcontainer.java.service.Service;

public class ContainerMetadataConfig {
    @Bean
    public MyService service() {
        return new Service();
    }
}
