package org.plus.cfe.ws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "impuesto")
public class Impuesto {
	
	private java.math.BigDecimal Base_calculo;
	private java.math.BigDecimal porciva;
	private java.math.BigDecimal valor;
	
}
