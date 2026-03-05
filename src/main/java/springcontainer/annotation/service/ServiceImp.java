package springcontainer.annotation.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceImp implements MyService {
    @Override
    public void doStuff() {
        System.out.println("Class implementing MyService(i):");
        System.out.println("is doing stuff ...");
    }
}
