package spring.di.field.service.implementations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import spring.di.field.service.interfaces.SortingAlgorithm;

@Component
@Primary
public class BubbleSortingAlgorithm implements SortingAlgorithm {
    @Override
    public String sort() {
        return "Bubble-sorting-algorithm";
    }
}
