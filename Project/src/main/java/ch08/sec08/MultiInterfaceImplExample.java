package ch08.sec08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        SmartTelevision searchable = new SmartTelevision();
        searchable.search("http://www.google.com");
    }
}
