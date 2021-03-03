package DesignPattertnBuilder.builders;

public class CarBuilder implements ICarBuilder{
	
	private Integer seats;
	private String color;
	private VehicleType vehicleType;
	private Engine engine;

	@Override
	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public void setVehicleType(VehicleType vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	public Car builCar() {
		return new Car(seats, color, vehicleType, engine);
	}

}
