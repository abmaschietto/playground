package DesignPatternFactory;

public class MotorcycleTrasnport extends TransportFactory {

	@Override
	protected Transportation createVehicle() {
		return new Motorcycle();
	}

}
