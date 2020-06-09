package org.plus.cfe.ws.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "encabezado")
public class Encabezado {

	private String codmoneda;
	private String comentarios;
	private int emisor;
	private java.math.BigDecimal factortrm;
	private java.sql.Timestamp fecha;  
	private java.sql.Timestamp fvence;
	private int idsuc;
	private int idvendedor;
	private int nit;
	private int numero;
	private String prefijo;
	private String ordencompra;
	private java.math.BigDecimal subtotal;
	private int sucursal;
	private java.math.BigDecimal total;
	private String usuario;
	private int totalDet;
	private int totalImp;
}
