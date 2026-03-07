package spring.dip;

import spring.dip.service.ClientFriendlyInterface;
import spring.dip.service.implementations.QuickSortingAlgorithm;

public class Application {
    public static void main(String[] args) {
        ClientFriendlyInterface friendlyInterface =
                new ClientFriendlyInterface(new QuickSortingAlgorithm());

        System.out.println(friendlyInterface.callSort());
    }
}
