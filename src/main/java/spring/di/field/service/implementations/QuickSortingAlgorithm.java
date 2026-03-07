package spring.di.field.service.implementations;

import org.springframework.stereotype.Component;
import spring.di.field.service.interfaces.SortingAlgorithm;

@Component
public class QuickSortingAlgorithm implements SortingAlgorithm {
    @Override
    public String sort() {
        return "Quick-sorting-algorithm";
    }
}
