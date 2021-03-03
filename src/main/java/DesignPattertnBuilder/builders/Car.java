package DesignPattertnBuilder.builders;

public class Car extends Vehicle{

	public Car(Integer seats, String color, VehicleType vehicleType, Engine engine) {
		super(seats, color, vehicleType, engine);
	}

	public void imprimeCarro() {
		System.out.println("Carro criado tipo " + getVehicleType() + "motor " + getEngine());
	}
}
