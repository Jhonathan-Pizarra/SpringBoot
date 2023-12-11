package com.uisrael.ticketsOnline.model;

import java.util.Date;
import lombok.Data;

@Data
public class Medico {
	
	private int idMedico;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String email;
	private Date fechaNacimiento;

}
