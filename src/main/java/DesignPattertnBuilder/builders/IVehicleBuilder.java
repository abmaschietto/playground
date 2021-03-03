package DesignPattertnBuilder.builders;

public interface IVehicleBuilder {
	
	public void setSeats(Integer seats);
	public void setColor(String color);
	public void setEngine(Engine engine);
	public void setVehicleType(VehicleType vehicleType);

}
