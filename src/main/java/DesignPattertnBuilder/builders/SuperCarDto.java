package DesignPattertnBuilder.builders;

import java.math.BigDecimal;

public class SuperCarDto extends VehicleDto{
	
	private BigDecimal bigPrice;

	public BigDecimal getBigPrice() {
		return bigPrice;
	}

	public void setBigPrice(BigDecimal bigPrice) {
		this.bigPrice = bigPrice;
	}
	
	

}
