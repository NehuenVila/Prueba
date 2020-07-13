package org.plus.cfe.ws.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "encabezado")
public class Encabezado implements Serializable {

	private java.math.BigDecimal baseimpuesto;
	private String codmoneda;
	private String comentarios;
	private int emisor;
	private java.math.BigDecimal factortrm;
	private java.sql.Timestamp fecha;  
	private java.sql.Timestamp fvence;
	private int idsuc;
	private int idvendedor;
	private java.math.BigDecimal iva;
	private String mediopago;
	private int metodopago;
	private int nit;
	private int numero;
	private String ordencompra;
	private String prefijo;
	private java.math.BigDecimal subtotal;
	private int sucursal;
	private String terminospago;
	private java.math.BigDecimal total;
	private String usuario;
	private int totalDet;
	private int totalImp;
	private String versionfe;

	
	public Encabezado() {
		
	}
	
	
	
	public java.math.BigDecimal getBaseimpuesto() {
		return baseimpuesto;
	}
	@XmlElement
	public void setBaseimpuesto(java.math.BigDecimal baseimpuesto) {
		this.baseimpuesto = baseimpuesto;
	}
	public java.math.BigDecimal getIva() {
		return iva;
	}
	@XmlElement
	public void setIva(java.math.BigDecimal iva) {
		this.iva = iva;
	}
	public String getTerminospago() {
		return terminospago;
	}
	@XmlElement
	public void setTerminospago(String terminospago) {
		this.terminospago = terminospago;
	}
	public String getVersionfe() {
		return versionfe;
	}
	@XmlElement
	public void setVersionfe(String versionfe) {
		this.versionfe = versionfe;
	}
	public String getMediopago() {
		return mediopago;
	}
	@XmlElement
	public void setMediopago(String mediopago) {
		this.mediopago = mediopago;
	}
	public int getMetodopago() {
		return metodopago;
	}
	@XmlElement
	public void setMetodopago(int metodopago) {
		this.metodopago = metodopago;
	}
	public String getCodmoneda() {
		return codmoneda;
	}
	@XmlElement
	public void setCodmoneda(String codmoneda) {
		this.codmoneda = codmoneda;
	}
	public String getComentarios() {
		return comentarios;
	}
	@XmlElement
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public int getEmisor() {
		return emisor;
	}
	@XmlElement
	public void setEmisor(int emisor) {
		this.emisor = emisor;
	}
	public java.math.BigDecimal getFactortrm() {
		return factortrm;
	}
	@XmlElement
	public void setFactortrm(java.math.BigDecimal factortrm) {
		this.factortrm = factortrm;
	}
	public java.sql.Timestamp getFecha() {
		return fecha;
	}
	@XmlElement
	public void setFecha(java.sql.Timestamp fecha) {
		this.fecha = fecha;
	}
	public java.sql.Timestamp getFvence() {
		return fvence;
	}
	@XmlElement
	public void setFvence(java.sql.Timestamp fvence) {
		this.fvence = fvence;
	}
	public int getIdsuc() {
		return idsuc;
	}
	@XmlElement
	public void setIdsuc(int idsuc) {
		this.idsuc = idsuc;
	}
	public int getIdvendedor() {
		return idvendedor;
	}
	@XmlElement
	public void setIdvendedor(int idvendedor) {
		this.idvendedor = idvendedor;
	}
	public int getNit() {
		return nit;
	}
	@XmlElement
	public void setNit(int nit) {
		this.nit = nit;
	}
	public int getNumero() {
		return numero;
	}
	@XmlElement
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPrefijo() {
		return prefijo;
	}
	@XmlElement
	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}
	public String getOrdencompra() {
		return ordencompra;
	}
	@XmlElement
	public void setOrdencompra(String ordencompra) {
		this.ordencompra = ordencompra;
	}
	public java.math.BigDecimal getSubtotal() {
		return subtotal;
	}
	@XmlElement
	public void setSubtotal(java.math.BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public int getSucursal() {
		return sucursal;
	}
	@XmlElement
	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}
	public java.math.BigDecimal getTotal() {
		return total;
	}
	@XmlElement
	public void setTotal(java.math.BigDecimal total) {
		this.total = total;
	}
	public String getUsuario() {
		return usuario;
	}
	@XmlElement
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getTotalDet() {
		return totalDet;
	}
	@XmlElement
	public void setTotalDet(int totalDet) {
		this.totalDet = totalDet;
	}
	public int getTotalImp() {
		return totalImp;
	}
	@XmlElement
	public void setTotalImp(int totalImp) {
		this.totalImp = totalImp;
	}

}