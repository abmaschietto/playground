package DesignPattertnBuilder.builders;

public class Truck extends Vehicle{
	
	private Integer carga;

	public Truck(Integer seats, String color, VehicleType vehicleType, Engine engine, Integer carga) {
		super(seats, color, vehicleType, engine);
		this.carga = carga;
	}

	public Integer getCarga() {
		return carga;
	}
	
	public void ImprimeCaminhao() {
		System.out.println("Camminhão modelado " + this.getVehicleType() + " carregando " + this.carga);
	}
	
	

	
}
