package org.plus.cfe.ws.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "documento")
public class Documento {

	List<Detalle> detalle = new ArrayList<Detalle>();
	Encabezado encabezado = new Encabezado();
	List<Impuesto> impuesto = new ArrayList<Impuesto>();
	Sucursal sucursal = new Sucursal();
	Tercero tercero = new Tercero();
}
