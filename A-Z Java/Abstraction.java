// package basics;

public class Abstraction {

	public static void main(String[] args) {

		Audi a1 = new Audi();
		a1.start();

	}

}

class Audi extends Car {

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Audi is starting");
	}

}

class BMW extends Car {

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW is starting");
	}

}

abstract class Car {

	int price;

	abstract void start();

	void breaks() {
		System.out.println("car is in break");
	}
}
