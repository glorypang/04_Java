package ch07.sec11.exam02;

public class Cat extends Animal {
    @Override
    public void breathe() {
        super.breathe();
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
