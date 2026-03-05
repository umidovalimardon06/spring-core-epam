package spring.di.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "spring.di")
public class containerMetadataConfig {
}
