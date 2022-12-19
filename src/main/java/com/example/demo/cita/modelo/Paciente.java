package com.example.demo.cita.modelo;

import java.time.LocalDateTime;

public class Paciente {
	
	private String nombre;
	private String apellido;
	private String cedula;
	private LocalDateTime fechaNacimiento;
	
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
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	
	
	
	

}
