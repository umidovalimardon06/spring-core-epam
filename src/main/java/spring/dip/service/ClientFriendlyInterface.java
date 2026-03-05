package spring.dip.service;

import spring.dip.service.interfaces.SortingAlgorithm;

public class ClientFriendlyInterface {
    private SortingAlgorithm sortingAlgorithm;

    public ClientFriendlyInterface(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public String callSort() {
        return sortingAlgorithm.sort();
    }

}
