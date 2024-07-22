// package basics;

public class Interfaces implements Car, Person {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("my car is starting");

    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub

    }

}

interface Car {
    void start();
}

interface Person {
    void walk();
}