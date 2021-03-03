package DesignPatternFactory;

public class CarTransport extends TransportFactory{

	@Override
	protected Transportation createVehicle() {
		return new Car();
	}

}
