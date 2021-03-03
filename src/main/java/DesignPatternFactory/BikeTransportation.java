package DesignPatternFactory;

public class BikeTransportation extends TransportFactory{

	@Override
	protected Transportation createVehicle() {
		return new Bike();
	}

}
