package spring.di.setter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.di.setter.service.interfaces.SortingAlgorithm;

@Component
public class ClientFriendlyInterface {
    private SortingAlgorithm sortingAlgorithm;

    @Autowired
    public void setSortingAlgorithm(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public String callSort() {
        return sortingAlgorithm.sort();
    }

}
