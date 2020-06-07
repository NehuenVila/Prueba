package org.plus.cfe.ws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tercero")
public class Tercero {
	private String apl2;
	private String apli1;
	private String comentarios;
	private String dv;
	private int identificacion; // es un BigInt que no se a que se refiere
	private int idTipoEmpresa;
	private int nit;
	private String nom1;
	private String nom2;
	private String razonSocial;
	private int tdoc;
	private String tipoPersona;
}
