package spring.di.constructor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.di.constructor.service.interfaces.SortingAlgorithm;

@Component
public class ClientFriendlyInterface {
    private SortingAlgorithm sortingAlgorithm;

    @Autowired
    public ClientFriendlyInterface(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public String callSort() {
        return sortingAlgorithm.sort();
    }

}
