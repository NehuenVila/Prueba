package org.plus.cfe.ws.model;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "detalle")
public class Detalle implements Serializable {

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
	private String subpartidaarancelaria;
	private java.math.BigDecimal subtotal;
	private java.math.BigDecimal subtotalusd;

	
	public Detalle() {
		
	}
	
	
	public String getSubpartidaarancelaria() {
		return subpartidaarancelaria;
	}
	@XmlElement
	public void setSubpartidaarancelaria(String subpartidaarancelaria) {
		this.subpartidaarancelaria = subpartidaarancelaria;
	}
	public String getAdicional() {
		return adicional;
	}
	@XmlElement
	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}
	public java.math.BigDecimal getCantidad() {
		return cantidad;
	}
	@XmlElement
	public void setCantidad(java.math.BigDecimal cantidad) {
		this.cantidad = cantidad;
	}
	public String getIdproducto() {
		return idproducto;
	}
	@XmlElement
	public void setIdproducto(String idproducto) {
		this.idproducto = idproducto;
	}
	public String getIdunidad() {
		return idunidad;
	}
	@XmlElement
	public void setIdunidad(String idunidad) {
		this.idunidad = idunidad;
	}
	public java.math.BigDecimal getIva() {
		return iva;
	}
	@XmlElement
	public void setIva(java.math.BigDecimal iva) {
		this.iva = iva;
	}
	public java.math.BigDecimal getIvausd() {
		return ivausd;
	}
	@XmlElement
	public void setIvausd(java.math.BigDecimal ivausd) {
		this.ivausd = ivausd;
	}
	public String getNombreproducto() {
		return nombreproducto;
	}
	@XmlElement
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public String getOperacion() {
		return operacion;
	}
	@XmlElement
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public java.math.BigDecimal getPorcdcto() {
		return porcdcto;
	}
	@XmlElement
	public void setPorcdcto(java.math.BigDecimal porcdcto) {
		this.porcdcto = porcdcto;
	}
	public java.math.BigDecimal getPorciva() {
		return porciva;
	}
	@XmlElement
	public void setPorciva(java.math.BigDecimal porciva) {
		this.porciva = porciva;
	}
	public java.math.BigDecimal getPos() {
		return pos;
	}
	@XmlElement
	public void setPos(java.math.BigDecimal pos) {
		this.pos = pos;
	}
	public java.math.BigDecimal getPrecio() {
		return precio;
	}
	@XmlElement
	public void setPrecio(java.math.BigDecimal precio) {
		this.precio = precio;
	}
	public java.math.BigDecimal getPreciousd() {
		return preciousd;
	}
	@XmlElement
	public void setPreciousd(java.math.BigDecimal preciousd) {
		this.preciousd = preciousd;
	}
	public java.math.BigDecimal getSubtotal() {
		return subtotal;
	}
	@XmlElement
	public void setSubtotal(java.math.BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public java.math.BigDecimal getSubtotalusd() {
		return subtotalusd;
	}
	@XmlElement
	public void setSubtotalusd(java.math.BigDecimal subtotalusd) {
		this.subtotalusd = subtotalusd;
	}
	
}

