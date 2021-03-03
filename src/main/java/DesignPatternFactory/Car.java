package DesignPatternFactory;

public class Car implements Transportation{

	@Override
	public void start() {
		pickUp();
		System.out.println("Começando a corrida!");
	}

	@Override
	public void pickUp() {
		System.out.println("Pegando o passageiro!");
		
	}

}
