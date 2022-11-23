package com.example.demo.spring.boot;
import org.springframework.stereotype.Component;

@Component
public class PacienteSB {
	
	
	public Integer carcularDescuento(){
		
		System.out.println("Sin Descuento");
		return 0;
	}
	
	public String nombre, cedula, tipo;
	
	//GETTER & SETTER

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "\nnombreP:" + nombre + "\ncedulaP=" + cedula + "\ntipo=" + tipo ;
	}
	

}
