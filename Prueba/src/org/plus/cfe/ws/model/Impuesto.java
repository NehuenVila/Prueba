package org.plus.cfe.ws.model;

import java.math.BigDecimal;
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "impuesto")
public class Impuesto  implements Serializable{
	
	private java.math.BigDecimal Base_calculo;
	private java.math.BigDecimal porciva;
	private java.math.BigDecimal valor;
	
	
	public Impuesto() {
		
	}
	
	public java.math.BigDecimal getBase_calculo() {
		return Base_calculo;
	}
	@XmlElement
	public void setBase_calculo(java.math.BigDecimal base_calculo) {
		Base_calculo = base_calculo;
	}
	public java.math.BigDecimal getPorciva() {
		return porciva;
	}
	@XmlElement
	public void setPorciva(java.math.BigDecimal porciva) {
		this.porciva = porciva;
	}
	public java.math.BigDecimal getValor() {
		return valor;
	}
	@XmlElement
	public void setValor(java.math.BigDecimal valor) {
		this.valor = valor;
	}
	
}

