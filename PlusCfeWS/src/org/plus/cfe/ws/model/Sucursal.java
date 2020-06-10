package org.plus.cfe.ws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "sucursal")
public class Sucursal {
	
	private String ciudad;
	private String codcliente;
	private String departamento;
	private String direcion1;
	private String depto;
	private String email;
	private String emailFe;
	private int idsuc;
	private int idvendedor;
	private int idzona;
	private String movil;
	private String num;
	private int nit;
	private String razonsocial;
	private String telefono1;
	private String telefono2;
	
	public Sucursal() {
		
	}
	
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCodcliente() {
		return codcliente;
	}
	public void setCodcliente(String codcliente) {
		this.codcliente = codcliente;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getDirecion1() {
		return direcion1;
	}
	public void setDirecion1(String direcion1) {
		this.direcion1 = direcion1;
	}
	public String getDepto() {
		return depto;
	}
	public void setDepto(String depto) {
		this.depto = depto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailFe() {
		return emailFe;
	}
	public void setEmailFe(String emailFe) {
		this.emailFe = emailFe;
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
	public int getIdzona() {
		return idzona;
	}
	public void setIdzona(int idzona) {
		this.idzona = idzona;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getNit() {
		return nit;
	}
	public void setNit(int nit) {
		this.nit = nit;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public String getTelefono1() {
		return telefono1;
	}
	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}
	public String getTelefono2() {
		return telefono2;
	}
	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}
	
	
}
