package org.plus.cfe.ws.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sucursal")
public class Sucursal {
	
	private String ciudad;
	private String codcliente;
	private String codigopostal;
	private String contacto1;
	private String ctoemail1;
	private String departamento;
	private String direcion1;
	private String depto;
	private String email;
	private String emailFe;
	private int idsuc;
	private int idvendedor;
//	private int idzona;
	private String movil;
	private String mun;
	private String paisreceptor;
//	private int nit;
	private String razonsocial;
	private String telefono1;
	private String telefono2;
	
	
	
	public Sucursal() {
		
	}


	
	
	public String getContacto1() {
		return contacto1;
	}
	@XmlElement
	public void setContacto1(String contacto1) {
		this.contacto1 = contacto1;
	}
	public String getCtoemail1() {
		return ctoemail1;
	}
	@XmlElement
	public void setCtoemail1(String ctoemail1) {
		this.ctoemail1 = ctoemail1;
	}
	public String getMun() {
		return mun;
	}
	@XmlElement
	public void setMun(String mun) {
		this.mun = mun;
	}
	public String getPaisreceptor() {
		return paisreceptor;
	}
	@XmlElement
	public void setPaisreceptor(String paisreceptor) {
		this.paisreceptor = paisreceptor;
	}
	public String getCodigopostal() {
		return codigopostal;
	}
	@XmlElement
	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}
	public String getCiudad() {
		return ciudad;
	}
	@XmlElement
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCodcliente() {
		return codcliente;
	}
	@XmlElement
	public void setCodcliente(String codcliente) {
		this.codcliente = codcliente;
	}
	public String getDepartamento() {
		return departamento;
	}
	@XmlElement
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getDirecion1() {
		return direcion1;
	}
	@XmlElement
	public void setDirecion1(String direcion1) {
		this.direcion1 = direcion1;
	}
	public String getDepto() {
		return depto;
	}
	@XmlElement
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public String getEmail() {
		return email;
	}
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailFe() {
		return emailFe;
	}
	@XmlElement
	public void setEmailFe(String emailFe) {
		this.emailFe = emailFe;
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
//	public int getIdzona() {
//		return idzona;
//	}
//	@XmlElement
//	public void setIdzona(int idzona) {
//		this.idzona = idzona;
//	}
	public String getMovil() {
		return movil;
	}
	@XmlElement
	public void setMovil(String movil) {
		this.movil = movil;
	}
//	public int getNit() {
//		return nit;
//	}
//	@XmlElement
//	public void setNit(int nit) {
//		this.nit = nit;
//	}
	public String getRazonsocial() {
		return razonsocial;
	}
	@XmlElement
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public String getTelefono1() {
		return telefono1;
	}
	@XmlElement
	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}
	public String getTelefono2() {
		return telefono2;
	}
	@XmlElement
	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}
	
	
}
