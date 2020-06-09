package org.plus.cfe.ws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "detalle")
public class Detalle {

	private String adicional;
	private java.math.BigDecimal cantidad;
	private String idproducto;
	private String idunidad;
	private java.math.BigDecimal iva;
	private java.math.BigDecimal ivausd;
	private String nombreproducto;
	private String operacion;
	private java.math.BigDecimal porcdcto;
	private java.math.BigDecimal porciva;
	private java.math.BigDecimal pos;
	private java.math.BigDecimal precio;
	private java.math.BigDecimal preciousd;
	private java.math.BigDecimal subtotal;
	private java.math.BigDecimal subtotalusd;
}
