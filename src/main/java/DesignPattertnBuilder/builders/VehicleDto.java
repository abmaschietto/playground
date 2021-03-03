package DesignPattertnBuilder.builders;

public class VehicleDto {
	
	private static Integer carga;
	private static  String color;
	private static Engine engine;
	
	public Integer getCarga() {
		return carga;
	}
	public void setCarga(Integer carga) {
		this.carga = carga;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	
}
