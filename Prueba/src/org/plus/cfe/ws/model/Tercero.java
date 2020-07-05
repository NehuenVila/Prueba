package org.plus.cfe.ws.model;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tercero")
public class Tercero implements Serializable {
	
	private String apl2;
	private String apli1;
	private String comentarios;
	private String dv;
	private long identificacion;
	private int idtipoempresa;
	private int nit;
	private String nom1;
	private String nom2;
	private String razonsocial;
	private int tdoc;
	private String tipopersona;
	
	
	
	public Tercero() {
		
	}
	
	
	public String getApl2() {
		return apl2;
	}
	@XmlElement
	public void setApl2(String apl2) {
		this.apl2 = apl2;
	}
	public String getApli1() {
		return apli1;
	}
	@XmlElement
	public void setApli1(String apli1) {
		this.apli1 = apli1;
	}
	public String getComentarios() {
		return comentarios;
	}
	@XmlElement
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public String getDv() {
		return dv;
	}
	@XmlElement
	public void setDv(String dv) {
		this.dv = dv;
	}
	public long getIdentificacion() {
		return identificacion;
	}
	@XmlElement
	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}
	public int getIdtipoempresa() {
		return idtipoempresa;
	}
	@XmlElement
	public void setIdtipoempresa(int idtipoempresa) {
		this.idtipoempresa = idtipoempresa;
	}
	public int getNit() {
		return nit;
	}
	@XmlElement
	public void setNit(int nit) {
		this.nit = nit;
	}
	public String getNom1() {
		return nom1;
	}
	@XmlElement
	public void setNom1(String nom1) {
		this.nom1 = nom1;
	}
	public String getNom2() {
		return nom2;
	}
	@XmlElement
	public void setNom2(String nom2) {
		this.nom2 = nom2;
	}
	public String getRazonsocial() {
		return razonsocial;
	}
	@XmlElement
	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}
	public int getTdoc() {
		return tdoc;
	}
	@XmlElement
	public void setTdoc(int tdoc) {
		this.tdoc = tdoc;
	}
	public String getTipopersona() {
		return tipopersona;
	}
	@XmlElement
	public void setTipopersona(String tipopersona) {
		this.tipopersona = tipopersona;
	}
	
}

