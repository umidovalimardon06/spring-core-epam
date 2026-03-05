package springcontainer.java.service;

public class Service implements MyService{
    @Override
    public void doStuff() {
        System.out.println("Class implementing MyService(i):");
        System.out.println("is doing stuff ...");
    }
}
