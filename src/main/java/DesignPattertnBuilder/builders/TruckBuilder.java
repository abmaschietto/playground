package DesignPattertnBuilder.builders;

public class TruckBuilder implements ITruckBuilder{
	
	private Integer carga;
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

	@Override
	public void setCarga(Integer carga) {
		this.carga = carga;
	}
	
	public Truck buildTruck() {
		return new Truck(carga, color, vehicleType, engine, carga);
	}

}
