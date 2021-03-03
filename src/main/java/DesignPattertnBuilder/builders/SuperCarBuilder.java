package DesignPattertnBuilder.builders;

import java.math.BigDecimal;

public class SuperCarBuilder implements ISuperCarBuilder{

	private Integer seats;
	private String color;
	private VehicleType vehicleType;
	private Engine engine;
	private BigDecimal bigPrice;
	
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
	public void setBigPrice(BigDecimal bigPrice) {
		this.bigPrice = bigPrice;
		
	}
	public SportCar buildSuperCar() {
		return new SportCar(seats, color, vehicleType, engine, bigPrice);
	}



}
