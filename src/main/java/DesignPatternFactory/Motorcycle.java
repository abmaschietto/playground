package DesignPatternFactory;

public class Motorcycle implements Transportation{

	@Override
	public void start() {
		pickUp();
		System.out.println("Partiu");
	}

	@Override
	public void pickUp() {
		System.out.println("Pegando a marmita");
	}

}
