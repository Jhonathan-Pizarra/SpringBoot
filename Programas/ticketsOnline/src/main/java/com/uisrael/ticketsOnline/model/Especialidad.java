package com.uisrael.ticketsOnline.model;

import lombok.Data;

@Data
public class Especialidad {
	
	private int idEspecialidad;
	private String nombre Especialidad;
	private String descripcion Especialidad;
	private String codigo Especialidad;
	private boolean estadoRegistro; //true: activo; false: inactivo
	

}
