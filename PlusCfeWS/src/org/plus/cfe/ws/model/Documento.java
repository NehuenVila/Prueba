package org.plus.cfe.ws.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "documento")
public class Documento {

	private ArrayList<Detalle> detalles = new ArrayList<Detalle>();
	private Encabezado encabezado;
	private List<Impuesto> impuesto = new ArrayList<Impuesto>();
	private Sucursal sucursal;	
	private Tercero tercero;
	
	
	public Documento() {
	}
	public ArrayList<Detalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(ArrayList<Detalle> detalles) {
		this.detalles = detalles;
	}
	public Encabezado getEncabezado() {
		return encabezado;
	}
	public void setEncabezado(Encabezado encabezado) {
		this.encabezado = encabezado;
	}
	public List<Impuesto> getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(List<Impuesto> impuesto) {
		this.impuesto = impuesto;
	}
	public Sucursal getSucursal() {
		return sucursal;
	}
	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	public Tercero getTercero() {
		return tercero;
	}
	public void setTercero(Tercero tercero) {
		this.tercero = tercero;
	}
	
}
