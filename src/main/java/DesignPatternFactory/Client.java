package DesignPatternFactory;

public class Client {
	
	private static TransportFactory transportFactory;
	
	public static void main(String[] args) {
		
		String pedido = "moto";
		teste(pedido);
		transportFactory.startVehicle();
	}

	private static void teste(String pedido) {
		switch (pedido) {
		case "uber":
			transportFactory = new CarTransport();
			break;
		case "bike":
			transportFactory = new BikeTransportation();
			break;
		case "moto":
			transportFactory = new MotorcycleTrasnport();
			break;
		default:
			System.out.println("Escolha uma opção");
		}
	}
}
