package spring.di.service.implementations;

import org.springframework.stereotype.Component;
import spring.di.service.interfaces.SortingAlgorithm;

@Component
public class QuickSortingAlgorithm implements SortingAlgorithm {
    @Override
    public String sort() {
        return "Quick-sorting-algorithm";
    }
}
