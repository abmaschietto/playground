package DesignPattertnBuilder.builders;

import java.math.BigDecimal;

public class SportCar extends Vehicle{
	
	private BigDecimal bigPrice;

	public SportCar(Integer seats, String color, VehicleType vehicleType, Engine engine, BigDecimal bigPrice) {
		super(seats, color, vehicleType, engine);
		this.bigPrice = bigPrice;
	}

	public BigDecimal getBigPrice() {
		return bigPrice;
	}

	public void atestadoCompetencia() {
		System.out.println("Super carro criado no valor de " + this.bigPrice + " e do tipo " + getVehicleType());
	}
	
}
