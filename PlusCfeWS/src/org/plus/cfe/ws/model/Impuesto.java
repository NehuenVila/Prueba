package org.plus.cfe.ws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "impuesto")
public class Impuesto {
	
	private java.math.BigDecimal Base_calculo;
	private java.math.BigDecimal porciva;
	private java.math.BigDecimal valor;
	
	public Impuesto() {
		
	}
	
	
	public java.math.BigDecimal getBase_calculo() {
		return Base_calculo;
	}
	public void setBase_calculo(java.math.BigDecimal base_calculo) {
		Base_calculo = base_calculo;
	}
	public java.math.BigDecimal getPorciva() {
		return porciva;
	}
	public void setPorciva(java.math.BigDecimal porciva) {
		this.porciva = porciva;
	}
	public java.math.BigDecimal getValor() {
		return valor;
	}
	public void setValor(java.math.BigDecimal valor) {
		this.valor = valor;
	}
	
}
