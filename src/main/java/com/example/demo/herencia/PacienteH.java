package com.example.demo.herencia;

public class PacienteH {
	
	
	protected Integer carcularDescuento(){
		
		System.out.println("Sin Descuento");
		return 0;
	}
	
	private String nombre, cedula, tipo;
	
	//GETTER & SETTER

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getCedula() {
		return cedula;
	}

	protected void setCedula(String cedula) {
		this.cedula = cedula;
	}

	protected String getTipo() {
		return tipo;
	}

	protected void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "\nnombreP:" + nombre + "\ncedulaP=" + cedula + "\ntipo=" + tipo ;
	}
	

}
