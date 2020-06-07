package org.plus.cfe.ws.model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "encabezado")
public class Encabezado {

	private String codMoneda;
	private String comentarios;
	private int emisor; // Integer Identificación de la empresa que emite el DocFE, no se si es int
	private int facTortrm; // numerico
	private Date fecha; // chequear data si es con la libreria que va
	private Date fVence;
	private int idSuc;
	private int idVendedor;
	private int nit;
	private int numero;
	private String prefijo;
	private int subTotal; // numerico
	private int sucursal;
	private int total; // numerico
	private String usuario;
	private int totalDet;
	private int totaLlmp;
}
