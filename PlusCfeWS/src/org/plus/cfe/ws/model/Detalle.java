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
	
	
	public Detalle() {
		
	}
	
	
	public String getAdicional() {
		return adicional;
	}
	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}
	public java.math.BigDecimal getCantidad() {
		return cantidad;
	}
	public void setCantidad(java.math.BigDecimal cantidad) {
		this.cantidad = cantidad;
	}
	public String getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(String idproducto) {
		this.idproducto = idproducto;
	}
	public String getIdunidad() {
		return idunidad;
	}
	public void setIdunidad(String idunidad) {
		this.idunidad = idunidad;
	}
	public java.math.BigDecimal getIva() {
		return iva;
	}
	public void setIva(java.math.BigDecimal iva) {
		this.iva = iva;
	}
	public java.math.BigDecimal getIvausd() {
		return ivausd;
	}
	public void setIvausd(java.math.BigDecimal ivausd) {
		this.ivausd = ivausd;
	}
	public String getNombreproducto() {
		return nombreproducto;
	}
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public java.math.BigDecimal getPorcdcto() {
		return porcdcto;
	}
	public void setPorcdcto(java.math.BigDecimal porcdcto) {
		this.porcdcto = porcdcto;
	}
	public java.math.BigDecimal getPorciva() {
		return porciva;
	}
	public void setPorciva(java.math.BigDecimal porciva) {
		this.porciva = porciva;
	}
	public java.math.BigDecimal getPos() {
		return pos;
	}
	public void setPos(java.math.BigDecimal pos) {
		this.pos = pos;
	}
	public java.math.BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(java.math.BigDecimal precio) {
		this.precio = precio;
	}
	public java.math.BigDecimal getPreciousd() {
		return preciousd;
	}
	public void setPreciousd(java.math.BigDecimal preciousd) {
		this.preciousd = preciousd;
	}
	public java.math.BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(java.math.BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public java.math.BigDecimal getSubtotalusd() {
		return subtotalusd;
	}
	public void setSubtotalusd(java.math.BigDecimal subtotalusd) {
		this.subtotalusd = subtotalusd;
	}
	
}
