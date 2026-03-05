package spring.dip.service.implementations;

import org.springframework.stereotype.Service;
import spring.dip.service.interfaces.SortingAlgorithm;

public class BubbleSortingAlgorithm implements SortingAlgorithm {
    @Override
    public String sort() {
        return "Bubble-sorting-algorithm";
    }
}
