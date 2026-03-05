package spring.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import spring.di.service.interfaces.SortingAlgorithm;

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
