package spring.di.field.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.di.field.service.interfaces.SortingAlgorithm;

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
