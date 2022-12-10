package com.example.demo.tienda.modelo;

public class cliente {
	
	private String cedula;
	private String nombre;
	private String tipo;
	
	//metodos set y get
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "cliente [cedula=" + cedula + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
	

}
