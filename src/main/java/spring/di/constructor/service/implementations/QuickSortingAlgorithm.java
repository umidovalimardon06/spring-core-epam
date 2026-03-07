package spring.di.constructor.service.implementations;

import org.springframework.stereotype.Component;
import spring.di.constructor.service.interfaces.SortingAlgorithm;

@Component
public class QuickSortingAlgorithm implements SortingAlgorithm {
    @Override
    public String sort() {
        return "Quick-sorting-algorithm";
    }
}
