package DesignPattertnBuilder.builders;

public class DirectorBuilder {
	
	public void constructTruck(ITruckBuilder truckBuilder, VehicleDto vehicle) {
		truckBuilder.setCarga(vehicle.getCarga());
		truckBuilder.setColor(vehicle.getColor());
		truckBuilder.setEngine(vehicle.getEngine());
		truckBuilder.setSeats(2);
		truckBuilder.setVehicleType(VehicleType.TRUCK);
	}
	
	public void constructCar(ICarBuilder carBuilder, VehicleDto vehicle) {
		carBuilder.setColor(vehicle.getColor());
		carBuilder.setEngine(vehicle.getEngine());
		carBuilder.setSeats(4);
		carBuilder.setVehicleType(VehicleType.HATCH);
	}
	
	public void constructSuperCar(ISuperCarBuilder superCarBuilder, SuperCarDto vehicle) {
		superCarBuilder.setColor(vehicle.getColor());
		superCarBuilder.setEngine(vehicle.getEngine());
		superCarBuilder.setSeats(1);
		superCarBuilder.setVehicleType(VehicleType.LIMO);
		superCarBuilder.setBigPrice(vehicle.getBigPrice());
	}

}
