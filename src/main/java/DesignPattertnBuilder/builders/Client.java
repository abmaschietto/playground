package DesignPattertnBuilder.builders;

import java.math.BigDecimal;

public class Client {

	public static void main(String[] args) {

		DirectorBuilder directorBuilder = new DirectorBuilder();
		TruckBuilder truckBuilder = new TruckBuilder();
		SuperCarBuilder superCarBuilder = new SuperCarBuilder();
		Integer carga = 550;
		String color = "blue";
		BigDecimal bigPrice =  new BigDecimal(1567089);
		Engine engine = new Engine(345);
		SuperCarDto vehicle = new SuperCarDto();
		vehicle.setCarga(carga);
		vehicle.setColor(color);
		vehicle.setEngine(engine);
		vehicle.setBigPrice(bigPrice);
		directorBuilder.constructTruck(truckBuilder, vehicle);
		Truck buildTruck = truckBuilder.buildTruck();
		buildTruck.ImprimeCaminhao();
		directorBuilder.constructSuperCar(superCarBuilder, vehicle);
		SportCar buildSuperCar = superCarBuilder.buildSuperCar();
		buildSuperCar.atestadoCompetencia();
		
	}
}
