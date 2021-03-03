package DesignPattertnBuilder.builders;

import java.math.BigDecimal;

public interface ISuperCarBuilder extends IVehicleBuilder{
	
	void setBigPrice(BigDecimal bigPrice);

}
