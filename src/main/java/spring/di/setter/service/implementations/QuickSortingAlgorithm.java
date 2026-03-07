package spring.di.setter.service.implementations;

import org.springframework.stereotype.Component;
import spring.di.setter.service.interfaces.SortingAlgorithm;

@Component
public class QuickSortingAlgorithm implements SortingAlgorithm {
    @Override
    public String sort() {
        return "Quick-sorting-algorithm";
    }
}
