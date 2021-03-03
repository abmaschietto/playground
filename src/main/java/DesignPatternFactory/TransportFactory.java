package DesignPatternFactory;

public abstract class TransportFactory {
	
	void startVehicle() {
		Transportation transport = createVehicle();
		transport.start();
	}
	
	protected abstract Transportation createVehicle();
	
}
