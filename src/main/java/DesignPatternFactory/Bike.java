package DesignPatternFactory;

public class Bike implements Transportation{

	@Override
	public void start() {
		pickUp();
		System.out.println("dando um grau");
	}

	@Override
	public void pickUp() {
		System.out.println("i foooodd");
	}

}
