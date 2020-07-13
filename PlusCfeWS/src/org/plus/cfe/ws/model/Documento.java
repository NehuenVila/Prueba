package org.plus.cfe.ws.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
@XmlRootElement(name = "documento")
public class Documento implements Serializable {
	

	private List<Detalle> detalles = new ArrayList<Detalle>();
	private Encabezado encabezado;
	private List<Impuesto> impuesto = new ArrayList<Impuesto>();
	private Sucursal sucursal;	
	private Tercero tercero;
	
	public Documento() {
		
	}
	
	public List<Detalle> getDetalles() {
		return detalles;
	}
	@XmlElement
	public void setDetalles(List<Detalle> detalles) {
		this.detalles = detalles;
	}
	public Encabezado getEncabezado() {
		return encabezado;
	}
	@XmlElement
	public void setEncabezado(Encabezado encabezado) {
		this.encabezado = encabezado;
	}
	public List<Impuesto> getImpuesto() {
		return impuesto;
	}
	@XmlElement
	public void setImpuesto(List<Impuesto> impuesto) {
		this.impuesto = impuesto;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	@XmlElement
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public Tercero getTercero() {
		return tercero;
	}
	@XmlElement
	public void setTercero(Tercero tercero) {
		this.tercero = tercero;
	}
	
	
	
}



