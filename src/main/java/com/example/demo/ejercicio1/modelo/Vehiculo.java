package com.example.demo.ejercicio1.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Vehiculo {

	private String marca;
	private String placa;
	private String tipo;
	private BigDecimal precio;
	
	
	
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", placa=" + placa + ", tipo=" + tipo + ", precio=" + precio + "]";
	}
	//SET y GET
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	
	
	
	
	
	
	

}
