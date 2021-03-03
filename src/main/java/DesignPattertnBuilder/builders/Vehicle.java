package DesignPattertnBuilder.builders;

public class Vehicle {
	
	private Integer seats;
	private String color;
	private VehicleType vehicleType;
	private Engine engine;
	
	public Vehicle(Integer seats, String color, VehicleType vehicleType, Engine engine) {
		super();
		this.seats = seats;
		this.color = color;
		this.vehicleType = vehicleType;
		this.engine = engine;
	}

	public Integer getSeats() {
		return seats;
	}

	public String getColor() {
		return color;
	}

	public VehicleType getVehicleType() {
		return vehicleType;
	}

	public Engine getEngine() {
		return engine;
	}

	

}
