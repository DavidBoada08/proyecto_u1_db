package com.example.demo.cita.modelo;

import java.time.LocalDateTime;

public class Doctor {
	
	private String nombre;
	private String apellido;
	private String cedula;
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Doctor [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]";
	}

	
	
	
	
	

}
