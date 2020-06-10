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
	
	public Encabezado() {
		
	}
	
	
	public String getCodmoneda() {
		return codmoneda;
	}
	public void setCodmoneda(String codmoneda) {
		this.codmoneda = codmoneda;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public int getEmisor() {
		return emisor;
	}
	public void setEmisor(int emisor) {
		this.emisor = emisor;
	}
	public java.math.BigDecimal getFactortrm() {
		return factortrm;
	}
	public void setFactortrm(java.math.BigDecimal factortrm) {
		this.factortrm = factortrm;
	}
	public java.sql.Timestamp getFecha() {
		return fecha;
	}
	public void setFecha(java.sql.Timestamp fecha) {
		this.fecha = fecha;
	}
	public java.sql.Timestamp getFvence() {
		return fvence;
	}
	public void setFvence(java.sql.Timestamp fvence) {
		this.fvence = fvence;
	}
	public int getIdsuc() {
		return idsuc;
	}
	public void setIdsuc(int idsuc) {
		this.idsuc = idsuc;
	}
	public int getIdvendedor() {
		return idvendedor;
	}
	public void setIdvendedor(int idvendedor) {
		this.idvendedor = idvendedor;
	}
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPrefijo() {
		return prefijo;
	}
	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}
	public String getOrdencompra() {
		return ordencompra;
	}
	public void setOrdencompra(String ordencompra) {
		this.ordencompra = ordencompra;
	}
	public java.math.BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(java.math.BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public int getSucursal() {
		return sucursal;
	}
	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}
	public java.math.BigDecimal getTotal() {
		return total;
	}
	public void setTotal(java.math.BigDecimal total) {
		this.total = total;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public int getTotalDet() {
		return totalDet;
	}
	public void setTotalDet(int totalDet) {
		this.totalDet = totalDet;
	}
	public int getTotalImp() {
		return totalImp;
	}
	public void setTotalImp(int totalImp) {
		this.totalImp = totalImp;
	}
	private int sucursal;
	private java.math.BigDecimal total;
	private String usuario;
	private int totalDet;
	private int totalImp;
}
