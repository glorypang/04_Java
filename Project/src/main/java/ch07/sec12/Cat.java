package ch07.sec12;

public class Cat extends Animal {
    public Cat() {
        super.name = "비비";
    }

    @Override
    public void sound() {
        System.out.println(name + " : 야옹, 하악, 골골");
    }
}
